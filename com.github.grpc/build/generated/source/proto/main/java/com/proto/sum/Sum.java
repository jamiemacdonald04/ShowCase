// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Sum/Sum.proto

package com.proto.sum;

public final class Sum {
  private Sum() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Sum_SumVars_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Sum_SumVars_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Sum_SingleSumVars_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Sum_SingleSumVars_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Sum_SingleSumRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Sum_SingleSumRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Sum_SumRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Sum_SumRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Sum_SumResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Sum_SumResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Sum_HelloReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Sum_HelloReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Sum_HelloResp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Sum_HelloResp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rSum/Sum.proto\022\003Sum\"C\n\007SumVars\022\026\n\016multi" +
      "plyValues\030\001 \003(\005\022\024\n\007message\030\002 \001(\tH\000\210\001\001B\n\n" +
      "\010_message\"D\n\rSingleSumVars\022\021\n\ttheNumber\030" +
      "\001 \001(\005\022\024\n\007message\030\002 \001(\tH\000\210\001\001B\n\n\010_message\"" +
      "=\n\020SingleSumRequest\022)\n\rsingleSumVars\030\001 \001" +
      "(\0132\022.Sum.SingleSumVars\"+\n\nSumRequest\022\035\n\007" +
      "sumvars\030\001 \001(\0132\014.Sum.SumVars\"\035\n\013SumRespon" +
      "se\022\016\n\006result\030\001 \001(\t\"\033\n\010HelloReq\022\017\n\007subjec" +
      "t\030\001 \001(\t\"\031\n\tHelloResp\022\014\n\004text\030\001 \001(\t2\261\002\n\nS" +
      "umService\0225\n\016CalculateSumOf\022\017.Sum.SumReq" +
      "uest\032\020.Sum.SumResponse\"\000\022&\n\005Hello\022\r.Sum." +
      "HelloReq\032\016.Sum.HelloResp\022=\n\024CalculateSum" +
      "OfStream\022\017.Sum.SumRequest\032\020.Sum.SumRespo" +
      "nse\"\0000\001\022@\n\021calculateOnTheFly\022\025.Sum.Singl" +
      "eSumRequest\032\020.Sum.SumResponse\"\000(\001\022C\n\022pre" +
      "scriptionNumber\022\025.Sum.SingleSumRequest\032\020" +
      ".Sum.SumResponse\"\000(\0010\001B\021\n\rcom.proto.sumP" +
      "\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Sum_SumVars_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Sum_SumVars_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Sum_SumVars_descriptor,
        new java.lang.String[] { "MultiplyValues", "Message", "Message", });
    internal_static_Sum_SingleSumVars_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Sum_SingleSumVars_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Sum_SingleSumVars_descriptor,
        new java.lang.String[] { "TheNumber", "Message", "Message", });
    internal_static_Sum_SingleSumRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Sum_SingleSumRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Sum_SingleSumRequest_descriptor,
        new java.lang.String[] { "SingleSumVars", });
    internal_static_Sum_SumRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_Sum_SumRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Sum_SumRequest_descriptor,
        new java.lang.String[] { "Sumvars", });
    internal_static_Sum_SumResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_Sum_SumResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Sum_SumResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_Sum_HelloReq_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_Sum_HelloReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Sum_HelloReq_descriptor,
        new java.lang.String[] { "Subject", });
    internal_static_Sum_HelloResp_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_Sum_HelloResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Sum_HelloResp_descriptor,
        new java.lang.String[] { "Text", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
