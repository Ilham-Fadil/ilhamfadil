package com.cigma.demo.Models;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class CompanyId implements Serializable {

	private long rc;
	private long idTribunal;

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		CompanyId companyId = (CompanyId) o;
		return rc == companyId.rc && idTribunal == companyId.idTribunal;
	}

	@Override
	public int hashCode() {
		return Objects.hash(rc, idTribunal);
	}

}
