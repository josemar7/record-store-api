package org.pepo.recordstoreapi.controller;

import org.pepo.recordstoreapi.SwaggerCodgen.api.ArtistApi;
import org.pepo.recordstoreapi.SwaggerCodgen.model.ArtistResponseOpenApi;
import org.pepo.recordstoreapi.SwaggerCodgen.model.NationalityResponseOpenApi;
import org.pepo.recordstoreapi.SwaggerCodgen.model.StyleResponseOpenApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ArtistController implements ArtistApi {

    @Override
    public ResponseEntity<List<ArtistResponseOpenApi>> getAllArtists(Integer page, Integer size) {
        List<ArtistResponseOpenApi> artistResponseOpenApiList = new ArrayList<>();
        ArtistResponseOpenApi artistResponseOpenApi = new ArtistResponseOpenApi();
        artistResponseOpenApi.setId(1);
        artistResponseOpenApi.setName("Tune-Yards");
        NationalityResponseOpenApi nationalityResponseOpenApi = new NationalityResponseOpenApi();
        nationalityResponseOpenApi.setId(1);
        nationalityResponseOpenApi.setName("USA");
        artistResponseOpenApi.setNationality(nationalityResponseOpenApi);
        StyleResponseOpenApi styleResponseOpenApi = new StyleResponseOpenApi();
        styleResponseOpenApi.setId(1);
        styleResponseOpenApi.setName("Soul");
        artistResponseOpenApi.setStyle(styleResponseOpenApi);
        artistResponseOpenApiList.add(artistResponseOpenApi);
        return ResponseEntity.ok(artistResponseOpenApiList);
    }
}
