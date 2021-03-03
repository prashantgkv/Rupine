create  TABLE "public"."inst_profile"
(
        id bigserial PRIMARY KEY NOT NULL,
        active_template_id bigint,
        theme_id bigint,
        institution_name varchar(256),
        about_us text,
        no_of_bed int4,
        icu_bed int4,
        path_lab bool NOT NULL DEFAULT false,
        truma_facility bool NOT NULL DEFAULT false,
        infectious_disease_facility bool NOT NULL DEFAULT false,
        psychiatric_facility bool NOT NULL DEFAULT false,
        ambulance_facility bool NOT NULL DEFAULT false,
        website_address varchar(500),
        status varchar(10) DEFAULT 'ACTIVE' NULL,
        banner_url varchar(256),
        created_on timestamp NOT NULL,
        updated_on timestamp NOT NULL
);

INSERT INTO public.inst_profile
(active_template_id, theme_id, institution_name, about_us, no_of_bed, icu_bed, path_lab, truma_facility, infectious_disease_facility, psychiatric_facility, ambulance_facility, website_address, status, banner_url, created_on, updated_on)
VALUES(0, 0, 'Appolo Hospital', 'something about us', 200, 29, false, true, false, false, false, 'https://appolo.com', 'ACTIVE'::character varying, 'https://appolo_image.com', current_timestamp, current_timestamp);

select * from inst_profile;