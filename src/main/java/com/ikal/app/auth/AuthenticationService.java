package com.ikal.app.auth;

import com.ikal.app.auth.request.AuthenticationRequest;
import com.ikal.app.auth.request.RefreshRequest;
import com.ikal.app.auth.request.RegistrationRequest;
import com.ikal.app.auth.response.AuthenticationResponse;

public interface AuthenticationService {

    AuthenticationResponse login(AuthenticationRequest request);

    void register(RegistrationRequest request);

    AuthenticationResponse refreshToken(RefreshRequest req);
}
