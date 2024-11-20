# Project Setup Requirements

## Docker Setup
1. Install Docker Desktop from https://www.docker.com/products/docker-desktop/
2. Docker Compose is included with Docker Desktop
3. After installation, restart your computer
4. Verify installation with:
   ```
   docker --version
   docker-compose --version
   ```

## Project Architecture
- Frontend: React application on port 3000
- Backend: Node.js gRPC server on port 50051
- Envoy Proxy: gRPC-Web proxy on port 8080

Service Dependencies:
- Frontend requires Envoy proxy for authentication and gRPC-Web communication
- Envoy proxy requires backend gRPC server for service communication
- All services require Docker Desktop running for container operations

## Service Startup Order
1. Start Docker Desktop first: Must be running before any container operations
2. Start the backend gRPC server: Must be running on port 50051
3. Start the Envoy proxy: Run `docker-compose up -d` to start on port 8080
4. Start the frontend React application: Run `npm start` (default port 3000)

Common Connection Issues:
- "Connection refused" on login: Check if Envoy proxy is running on port 8080
- Backend connection errors: Verify gRPC server is running on port 50051
- "Network unreachable" error: Check Docker network settings and ensure host.docker.internal resolves correctly
  - Windows/macOS: host.docker.internal should work by default
  - Linux: Add `--add-host=host.docker.internal:host-gateway` to docker run command or extra_hosts in docker-compose
- Port conflicts: Use `netstat -ano | findstr :<PORT>` to find and `taskkill /PID <PID> /F` to kill conflicting processes

Port Configuration:
- Frontend: Default port 3000 (configurable with `set PORT=<number> && npm start` on Windows)
- Envoy Proxy: Port 8080 for gRPC-Web proxy, 9901 for admin interface
- Backend gRPC: Port 50051

Service Dependencies:
- Frontend requires Envoy proxy for authentication and gRPC-Web communication
- Envoy proxy requires backend gRPC server for service communication
- All services require Docker Desktop running for container operations

## Service Startup Order
1. Start Docker Desktop first: Must be running before any container operations
2. Start the backend gRPC server: Must be running on port 50051
3. Start the Envoy proxy: Run `docker-compose up` to start on port 8080
4. Start the frontend React application: Run `npm start` (default port 3000)

Common Connection Issues:
- "Connection refused" on login: Check if Envoy proxy is running on port 8080
- Backend connection errors: Verify gRPC server is running on port 50051
- "Network unreachable" error: Check Docker network settings and ensure host.docker.internal resolves correctly
  - Windows/macOS: host.docker.internal should work by default
  - Linux: Add `--add-host=host.docker.internal:host-gateway` to docker run command or extra_hosts in docker-compose
- Port conflicts: Use `netstat -ano | findstr :<PORT>` to find and `taskkill /PID <PID> /F` to kill conflicting processes

## Service Startup Order
1. Start Docker Desktop first: Must be running before any container operations
2. Start the backend gRPC server: Must be running on port 50051
3. Start the Envoy proxy: Run `docker-compose up` to start on port 8080
4. Start the frontend React application: Run `npm start` (default port 3000)

Common Connection Issues:
- "Connection refused" on login: Check if Envoy proxy is running on port 8080
- Backend connection errors: Verify gRPC server is running on port 50051
- Port conflicts: Use `netstat -ano | findstr :<PORT>` to find and `taskkill /PID <PID> /F` to kill conflicting processes

[Rest of existing content remains unchanged...]
