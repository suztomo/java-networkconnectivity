/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.networkconnectivity.v1.stub;

import static com.google.cloud.networkconnectivity.v1.HubServiceClient.ListHubsPagedResponse;
import static com.google.cloud.networkconnectivity.v1.HubServiceClient.ListSpokesPagedResponse;

import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.networkconnectivity.v1.ActivateSpokeRequest;
import com.google.cloud.networkconnectivity.v1.CreateHubRequest;
import com.google.cloud.networkconnectivity.v1.CreateSpokeRequest;
import com.google.cloud.networkconnectivity.v1.DeactivateSpokeRequest;
import com.google.cloud.networkconnectivity.v1.DeleteHubRequest;
import com.google.cloud.networkconnectivity.v1.DeleteSpokeRequest;
import com.google.cloud.networkconnectivity.v1.GetHubRequest;
import com.google.cloud.networkconnectivity.v1.GetSpokeRequest;
import com.google.cloud.networkconnectivity.v1.Hub;
import com.google.cloud.networkconnectivity.v1.ListHubsRequest;
import com.google.cloud.networkconnectivity.v1.ListHubsResponse;
import com.google.cloud.networkconnectivity.v1.ListSpokesRequest;
import com.google.cloud.networkconnectivity.v1.ListSpokesResponse;
import com.google.cloud.networkconnectivity.v1.OperationMetadata;
import com.google.cloud.networkconnectivity.v1.Spoke;
import com.google.cloud.networkconnectivity.v1.UpdateHubRequest;
import com.google.cloud.networkconnectivity.v1.UpdateSpokeRequest;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.OperationsStub;
import com.google.protobuf.Empty;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the HubService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public abstract class HubServiceStub implements BackgroundResource {

  public OperationsStub getOperationsStub() {
    throw new UnsupportedOperationException("Not implemented: getOperationsStub()");
  }

  public UnaryCallable<ListHubsRequest, ListHubsPagedResponse> listHubsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listHubsPagedCallable()");
  }

  public UnaryCallable<ListHubsRequest, ListHubsResponse> listHubsCallable() {
    throw new UnsupportedOperationException("Not implemented: listHubsCallable()");
  }

  public UnaryCallable<GetHubRequest, Hub> getHubCallable() {
    throw new UnsupportedOperationException("Not implemented: getHubCallable()");
  }

  public OperationCallable<CreateHubRequest, Hub, OperationMetadata> createHubOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: createHubOperationCallable()");
  }

  public UnaryCallable<CreateHubRequest, Operation> createHubCallable() {
    throw new UnsupportedOperationException("Not implemented: createHubCallable()");
  }

  public OperationCallable<UpdateHubRequest, Hub, OperationMetadata> updateHubOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: updateHubOperationCallable()");
  }

  public UnaryCallable<UpdateHubRequest, Operation> updateHubCallable() {
    throw new UnsupportedOperationException("Not implemented: updateHubCallable()");
  }

  public OperationCallable<DeleteHubRequest, Empty, OperationMetadata>
      deleteHubOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteHubOperationCallable()");
  }

  public UnaryCallable<DeleteHubRequest, Operation> deleteHubCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteHubCallable()");
  }

  public UnaryCallable<ListSpokesRequest, ListSpokesPagedResponse> listSpokesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listSpokesPagedCallable()");
  }

  public UnaryCallable<ListSpokesRequest, ListSpokesResponse> listSpokesCallable() {
    throw new UnsupportedOperationException("Not implemented: listSpokesCallable()");
  }

  public UnaryCallable<GetSpokeRequest, Spoke> getSpokeCallable() {
    throw new UnsupportedOperationException("Not implemented: getSpokeCallable()");
  }

  public OperationCallable<CreateSpokeRequest, Spoke, OperationMetadata>
      createSpokeOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: createSpokeOperationCallable()");
  }

  public UnaryCallable<CreateSpokeRequest, Operation> createSpokeCallable() {
    throw new UnsupportedOperationException("Not implemented: createSpokeCallable()");
  }

  public OperationCallable<UpdateSpokeRequest, Spoke, OperationMetadata>
      updateSpokeOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: updateSpokeOperationCallable()");
  }

  public UnaryCallable<UpdateSpokeRequest, Operation> updateSpokeCallable() {
    throw new UnsupportedOperationException("Not implemented: updateSpokeCallable()");
  }

  public OperationCallable<DeactivateSpokeRequest, Spoke, OperationMetadata>
      deactivateSpokeOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: deactivateSpokeOperationCallable()");
  }

  public UnaryCallable<DeactivateSpokeRequest, Operation> deactivateSpokeCallable() {
    throw new UnsupportedOperationException("Not implemented: deactivateSpokeCallable()");
  }

  public OperationCallable<ActivateSpokeRequest, Spoke, OperationMetadata>
      activateSpokeOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: activateSpokeOperationCallable()");
  }

  public UnaryCallable<ActivateSpokeRequest, Operation> activateSpokeCallable() {
    throw new UnsupportedOperationException("Not implemented: activateSpokeCallable()");
  }

  public OperationCallable<DeleteSpokeRequest, Empty, OperationMetadata>
      deleteSpokeOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteSpokeOperationCallable()");
  }

  public UnaryCallable<DeleteSpokeRequest, Operation> deleteSpokeCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteSpokeCallable()");
  }

  @Override
  public abstract void close();
}
