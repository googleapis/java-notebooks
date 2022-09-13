terraform {
  required_providers {
    google = {
      source  = "hashicorp/google",
      version = "~> 3.46.0"
    }
  }
}

provider "google" {
  project = var.project_id
  region  = var.region
  zone    = var.zone
}

resource "google_project_service" "notebooks_api" {
  service            = "notebooks.googleapis.com"
  disable_on_destroy = false
}

//resource "null_resource" "graalvm" {
//  provisioner "local-exec" {
//    command     = "./.test/graalvm.sh"
//    working_dir = "../"
//  }
//  depends_on = [
//    google_project_service.notebooks_api,
//  ]
//}

resource "null_resource" "integration_test" {
  provisioner "local-exec" {
    command     = "./.test/integration-test.sh"
    working_dir = "../"
  }
  depends_on = [
    google_project_service.notebooks_api,
    null_resource.clirr,
    null_resource.javadoc,
    null_resource.lint,
    null_resource.unit_test
  ]
}

resource "null_resource" "unit_test" {
  provisioner "local-exec" {
    command     = "./.test/unit-test.sh"
    working_dir = "../"
  }
  depends_on = [
    google_project_service.notebooks_api
  ]
}

resource "null_resource" "javadoc" {
  provisioner "local-exec" {
    command     = "./.test/javadoc.sh"
    working_dir = "../"
  }
  depends_on = [
    google_project_service.notebooks_api
  ]
}

resource "null_resource" "lint" {
  provisioner "local-exec" {
    command     = "./.test/lint.sh"
    working_dir = "../"
  }
  depends_on = [
    google_project_service.notebooks_api
  ]
}

resource "null_resource" "clirr" {
  provisioner "local-exec" {
    command     = "./.test/clirr.sh"
    working_dir = "../"
  }
  depends_on = [
    google_project_service.notebooks_api
  ]
}