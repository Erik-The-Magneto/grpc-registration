// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: registration.proto

package com.example.autogen.grpc.registration;

public final class RegistrationOuterClass {
  private RegistrationOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_registration_LoginRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_registration_LoginRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_registration_LoginResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_registration_LoginResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\022registration.proto\022\014registration\"2\n\014Lo" +
      "ginRequest\022\020\n\010username\030\001 \001(\t\022\020\n\010password" +
      "\030\002 \001(\t\"\036\n\rLoginResponse\022\r\n\005token\030\001 \001(\t2P" +
      "\n\014Registration\022@\n\005Login\022\032.registration.L" +
      "oginRequest\032\033.registration.LoginResponse" +
      "B)\n%com.example.autogen.grpc.registratio" +
      "nP\001b\006proto3"
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
        }, assigner);
    internal_static_registration_LoginRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_registration_LoginRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_registration_LoginRequest_descriptor,
        new String[] { "Username", "Password", });
    internal_static_registration_LoginResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_registration_LoginResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_registration_LoginResponse_descriptor,
        new String[] { "Token", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}