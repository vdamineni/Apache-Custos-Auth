User and Group Management System
This project provides a system for managing users and groups using gRPC services. The system is designed with Protobuf-based models to define user profiles and groups, supporting core and application-specific attributes. It also includes gRPC services for creating, updating, and fetching user profiles and groups.
________________________________________
Objectives
1.	Protobuf Models:
o	Design the UserProfile model with core attributes like userId, firstName, lastName, email, etc.
o	Extend the UserProfile model with additional attributes specific to the application's context.
o	Create the Group model with attributes like name, description, and scopes.
o	Establish relationships between UserProfile and Group models as required.
2.	gRPC Services:
o	Implement gRPC services for user management functionalities:
	Create, update, and fetch user profiles.
	Create and fetch groups.
________________________________________
Deliverables
1. Protobuf Model Files
The following Protobuf files are included in the project:
•	user_management.proto: Defines the UserProfile and Group models, along with their attributes and relationships.
UserProfile Model
protobuf
Copy code
message UserProfile {
  string user_id = 1;
  string first_name = 2;
  string last_name = 3;
  string email = 4;
  string role = 5;
  string phone_number = 6;
}
Group Model
protobuf
Copy code
message Group {
  string name = 1;
  string description = 2;
  repeated string scopes = 3;
}
Relationship Example
•	Users can be associated with multiple groups, and groups can have multiple members.
________________________________________
2. gRPC Services
Implemented services include:
•	User Management:
o	CreateUser(UserProfile) returns (UserProfile)
o	UpdateUser(UserProfile) returns (UserProfile)
o	GetUserById(GetUserRequest) returns (UserProfile)
•	Group Management:
o	CreateGroup(Group) returns (Group)
o	GetGroupById(GetGroupRequest) returns (Group)
Example user_management.proto Service Definition
protobuf
Copy code
service UserManagementService {
  rpc CreateUser(UserProfile) returns (UserProfile);
  rpc UpdateUser(UserProfile) returns (UserProfile);
  rpc GetUserById(GetUserRequest) returns (UserProfile);
  rpc CreateGroup(Group) returns (Group);
  rpc GetGroupById(GetGroupRequest) returns (Group);
}
________________________________________
3. Documentation
•	Endpoints:
o	/CreateUser: Accepts UserProfile data and stores the user information.
o	/GetUserById: Fetches user details by user_id.
o	/CreateGroup: Creates a new group with the specified attributes.
o	/GetGroupById: Retrieves group details by group_id.
•	Example Usage:
o	Create User:
json
Copy code
{
  "user_id": "123",
  "first_name": "John",
  "last_name": "Doe",
  "email": "john.doe@example.com",
  "role": "admin",
  "phone_number": "123-456-7890"
}
o	Create Group:
json
Copy code
{
  "name": "Admins",
  "description": "Group for admin users",
  "scopes": ["read", "write", "execute"]
}
________________________________________
Setup Instructions
Prerequisites
•	Node.js installed (version >= 16.x)
•	npm or yarn
Steps to Run the gRPC Services
1.	Clone the Repository:
bash
Copy code
git clone https://github.com/vdamineni/Apache-Custos-Auth.git
cd Apache-Custos-Auth/custos-auth-backend
2.	Install Dependencies:
bash
Copy code
npm install
3.	Configure Environment Variables: Create a .env file in the custos-auth-backend directory:
makefile
Copy code
PORT=8082
GRPC_PORT=50051
CUSTOS_BASE_URL=https://api.playground.usecustos.org
CLIENT_ID=<your-client-id>
REDIRECT_URI=http://localhost:8082/callback
4.	Run the Backend Server:
bash
Copy code
node server.js
5.	Run gRPC Services:
o	Ensure the gRPC server is running on 50051.
6.	Frontend Setup:
o	Navigate to the custos-auth-frontend directory.
o	Install dependencies:
bash
Copy code
npm install
o	Start the frontend:
bash
Copy code
npm start
o	Access the application at http://localhost:3000.
________________________________________
Development Notes
•	Protobuf Compilation:
o	Use grpc-tools to compile .proto files:
bash
Copy code
npx grpc_tools_node_protoc --js_out=import_style=commonjs,binary --grpc_out=grpc_js:. proto/user_management.proto
•	CORS Configuration:
o	Ensure CORS is enabled for frontend-backend communication.
•	Testing:
o	Use grpcurl for testing gRPC services:
bash
Copy code
grpcurl -plaintext -import-path ./proto -proto user_management.proto localhost:50051 list
________________________________________
Contribution
1.	Fork the repository.
2.	Create a branch for your feature or fix.
3.	Submit a pull request with detailed changes.
________________________________________
License
This project is licensed under the Apache License 2.0. See the LICENSE file for more details.



