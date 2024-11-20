// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('@grpc/grpc-js');
var user_management_pb = require('./user_management_pb.js');
var user_pb = require('./user_pb.js');
var group_pb = require('./group_pb.js');

function serialize_custos_group_Group(arg) {
  if (!(arg instanceof group_pb.Group)) {
    throw new Error('Expected argument of type custos.group.Group');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_custos_group_Group(buffer_arg) {
  return group_pb.Group.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_custos_user_UserProfile(arg) {
  if (!(arg instanceof user_pb.UserProfile)) {
    throw new Error('Expected argument of type custos.user.UserProfile');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_custos_user_UserProfile(buffer_arg) {
  return user_pb.UserProfile.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_custos_usermanagement_GetGroupRequest(arg) {
  if (!(arg instanceof user_management_pb.GetGroupRequest)) {
    throw new Error('Expected argument of type custos.usermanagement.GetGroupRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_custos_usermanagement_GetGroupRequest(buffer_arg) {
  return user_management_pb.GetGroupRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_custos_usermanagement_GetUserRequest(arg) {
  if (!(arg instanceof user_management_pb.GetUserRequest)) {
    throw new Error('Expected argument of type custos.usermanagement.GetUserRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_custos_usermanagement_GetUserRequest(buffer_arg) {
  return user_management_pb.GetUserRequest.deserializeBinary(new Uint8Array(buffer_arg));
}


var UserManagementServiceService = exports.UserManagementServiceService = {
  createUser: {
    path: '/custos.usermanagement.UserManagementService/CreateUser',
    requestStream: false,
    responseStream: false,
    requestType: user_pb.UserProfile,
    responseType: user_pb.UserProfile,
    requestSerialize: serialize_custos_user_UserProfile,
    requestDeserialize: deserialize_custos_user_UserProfile,
    responseSerialize: serialize_custos_user_UserProfile,
    responseDeserialize: deserialize_custos_user_UserProfile,
  },
  updateUser: {
    path: '/custos.usermanagement.UserManagementService/UpdateUser',
    requestStream: false,
    responseStream: false,
    requestType: user_pb.UserProfile,
    responseType: user_pb.UserProfile,
    requestSerialize: serialize_custos_user_UserProfile,
    requestDeserialize: deserialize_custos_user_UserProfile,
    responseSerialize: serialize_custos_user_UserProfile,
    responseDeserialize: deserialize_custos_user_UserProfile,
  },
  getUserById: {
    path: '/custos.usermanagement.UserManagementService/GetUserById',
    requestStream: false,
    responseStream: false,
    requestType: user_management_pb.GetUserRequest,
    responseType: user_pb.UserProfile,
    requestSerialize: serialize_custos_usermanagement_GetUserRequest,
    requestDeserialize: deserialize_custos_usermanagement_GetUserRequest,
    responseSerialize: serialize_custos_user_UserProfile,
    responseDeserialize: deserialize_custos_user_UserProfile,
  },
  createGroup: {
    path: '/custos.usermanagement.UserManagementService/CreateGroup',
    requestStream: false,
    responseStream: false,
    requestType: group_pb.Group,
    responseType: group_pb.Group,
    requestSerialize: serialize_custos_group_Group,
    requestDeserialize: deserialize_custos_group_Group,
    responseSerialize: serialize_custos_group_Group,
    responseDeserialize: deserialize_custos_group_Group,
  },
  getGroupById: {
    path: '/custos.usermanagement.UserManagementService/GetGroupById',
    requestStream: false,
    responseStream: false,
    requestType: user_management_pb.GetGroupRequest,
    responseType: group_pb.Group,
    requestSerialize: serialize_custos_usermanagement_GetGroupRequest,
    requestDeserialize: deserialize_custos_usermanagement_GetGroupRequest,
    responseSerialize: serialize_custos_group_Group,
    responseDeserialize: deserialize_custos_group_Group,
  },
};

exports.UserManagementServiceClient = grpc.makeGenericClientConstructor(UserManagementServiceService);
