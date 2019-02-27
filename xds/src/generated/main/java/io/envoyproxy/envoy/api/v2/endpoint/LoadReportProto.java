// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/api/v2/endpoint/load_report.proto

package io.envoyproxy.envoy.api.v2.endpoint;

public final class LoadReportProto {
  private LoadReportProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_endpoint_UpstreamLocalityStats_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_endpoint_UpstreamLocalityStats_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_endpoint_UpstreamEndpointStats_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_endpoint_UpstreamEndpointStats_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_endpoint_EndpointLoadMetricStats_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_endpoint_EndpointLoadMetricStats_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_endpoint_ClusterStats_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_endpoint_ClusterStats_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_endpoint_ClusterStats_DroppedRequests_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_endpoint_ClusterStats_DroppedRequests_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'envoy/api/v2/endpoint/load_report.prot" +
      "o\022\025envoy.api.v2.endpoint\032\037envoy/api/v2/c" +
      "ore/address.proto\032\034envoy/api/v2/core/bas" +
      "e.proto\032\036google/protobuf/duration.proto\032" +
      "\034google/protobuf/struct.proto\032\027validate/" +
      "validate.proto\"\327\002\n\025UpstreamLocalityStats" +
      "\022-\n\010locality\030\001 \001(\0132\033.envoy.api.v2.core.L" +
      "ocality\022!\n\031total_successful_requests\030\002 \001" +
      "(\004\022\"\n\032total_requests_in_progress\030\003 \001(\004\022\034" +
      "\n\024total_error_requests\030\004 \001(\004\022I\n\021load_met" +
      "ric_stats\030\005 \003(\0132..envoy.api.v2.endpoint." +
      "EndpointLoadMetricStats\022M\n\027upstream_endp" +
      "oint_stats\030\007 \003(\0132,.envoy.api.v2.endpoint" +
      ".UpstreamEndpointStats\022\020\n\010priority\030\006 \001(\r" +
      "\"\237\002\n\025UpstreamEndpointStats\022+\n\007address\030\001 " +
      "\001(\0132\032.envoy.api.v2.core.Address\022)\n\010metad" +
      "ata\030\006 \001(\0132\027.google.protobuf.Struct\022!\n\031to" +
      "tal_successful_requests\030\002 \001(\004\022\"\n\032total_r" +
      "equests_in_progress\030\003 \001(\004\022\034\n\024total_error" +
      "_requests\030\004 \001(\004\022I\n\021load_metric_stats\030\005 \003" +
      "(\0132..envoy.api.v2.endpoint.EndpointLoadM" +
      "etricStats\"u\n\027EndpointLoadMetricStats\022\023\n" +
      "\013metric_name\030\001 \001(\t\022)\n!num_requests_finis" +
      "hed_with_metric\030\002 \001(\004\022\032\n\022total_metric_va" +
      "lue\030\003 \001(\001\"\371\002\n\014ClusterStats\022\037\n\014cluster_na" +
      "me\030\001 \001(\tB\t\272\351\300\003\004r\002 \001\022Y\n\027upstream_locality" +
      "_stats\030\002 \003(\0132,.envoy.api.v2.endpoint.Ups" +
      "treamLocalityStatsB\n\272\351\300\003\005\222\001\002\010\001\022\036\n\026total_" +
      "dropped_requests\030\003 \001(\004\022M\n\020dropped_reques" +
      "ts\030\005 \003(\01323.envoy.api.v2.endpoint.Cluster" +
      "Stats.DroppedRequests\0227\n\024load_report_int" +
      "erval\030\004 \001(\0132\031.google.protobuf.Duration\032E" +
      "\n\017DroppedRequests\022\033\n\010category\030\001 \001(\tB\t\272\351\300" +
      "\003\004r\002 \001\022\025\n\rdropped_count\030\002 \001(\004B8\n#io.envo" +
      "yproxy.envoy.api.v2.endpointB\017LoadReport" +
      "ProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.api.v2.core.AddressProto.getDescriptor(),
          io.envoyproxy.envoy.api.v2.core.BaseProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          validate.Validate.getDescriptor(),
        }, assigner);
    internal_static_envoy_api_v2_endpoint_UpstreamLocalityStats_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_api_v2_endpoint_UpstreamLocalityStats_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_endpoint_UpstreamLocalityStats_descriptor,
        new java.lang.String[] { "Locality", "TotalSuccessfulRequests", "TotalRequestsInProgress", "TotalErrorRequests", "LoadMetricStats", "UpstreamEndpointStats", "Priority", });
    internal_static_envoy_api_v2_endpoint_UpstreamEndpointStats_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_envoy_api_v2_endpoint_UpstreamEndpointStats_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_endpoint_UpstreamEndpointStats_descriptor,
        new java.lang.String[] { "Address", "Metadata", "TotalSuccessfulRequests", "TotalRequestsInProgress", "TotalErrorRequests", "LoadMetricStats", });
    internal_static_envoy_api_v2_endpoint_EndpointLoadMetricStats_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_envoy_api_v2_endpoint_EndpointLoadMetricStats_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_endpoint_EndpointLoadMetricStats_descriptor,
        new java.lang.String[] { "MetricName", "NumRequestsFinishedWithMetric", "TotalMetricValue", });
    internal_static_envoy_api_v2_endpoint_ClusterStats_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_envoy_api_v2_endpoint_ClusterStats_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_endpoint_ClusterStats_descriptor,
        new java.lang.String[] { "ClusterName", "UpstreamLocalityStats", "TotalDroppedRequests", "DroppedRequests", "LoadReportInterval", });
    internal_static_envoy_api_v2_endpoint_ClusterStats_DroppedRequests_descriptor =
      internal_static_envoy_api_v2_endpoint_ClusterStats_descriptor.getNestedTypes().get(0);
    internal_static_envoy_api_v2_endpoint_ClusterStats_DroppedRequests_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_endpoint_ClusterStats_DroppedRequests_descriptor,
        new java.lang.String[] { "Category", "DroppedCount", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.envoy.api.v2.core.AddressProto.getDescriptor();
    io.envoyproxy.envoy.api.v2.core.BaseProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}