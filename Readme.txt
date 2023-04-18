B1. Build proto file
    - request la gi ?
    - response la gi ?
    - method la gi ?
    - xay dung cho chuc nang nao ( registration, attendance ... )

B2. click chuot phai vao pom ( protobuf ) => Generate source and update folders || mvn compile || mvn install || mvn package ( remember cd to /protobuf path )

B3. Xay dung GRPC Sever:

    1. cau hinh application.yml
    2. them 1 class **GrpcServer (exetends ***Grpc.ImplBase), @GrpcServer on top class
    3. return cai gi thi reponseObserver(response)
    4. remember to reponseObserver.onCompleted()

B4. Xay dung GRPC Client:
    1. khai bao client : @GrpcClient on top field
    2. rpc call : client.login(request)
