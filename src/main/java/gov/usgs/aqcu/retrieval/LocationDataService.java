package gov.usgs.aqcu.retrieval;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDataServiceRequest;
import com.aquaticinformatics.aquarius.sdk.timeseries.servicemodels.Publish.LocationDataServiceResponse;

import gov.usgs.aqcu.util.LogExecutionTime;

@Repository
public class LocationDataService {
	private AquariusRetrievalService aquariusRetrievalService;

	@Autowired
	public LocationDataService(AquariusRetrievalService aquariusRetrievalService) {
		this.aquariusRetrievalService = aquariusRetrievalService;
	}

        @LogExecutionTime
	public LocationDataServiceResponse getRawResponse(String locationIdentifier) {
		LocationDataServiceRequest request = new LocationDataServiceRequest()
				.setLocationIdentifier(locationIdentifier);
		LocationDataServiceResponse locationData = aquariusRetrievalService.executePublishApiRequest(request);
		return locationData;
	}
}
