/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordinate System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CoordinateSystem#getCrsUrn <em>Crs Urn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CoordinateSystem#getLocations <em>Locations</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCoordinateSystem()
 * @model
 * @generated
 */
public interface CoordinateSystem extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Crs Urn</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Crs Urn</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Crs Urn</em>' attribute.
     * @see #isSetCrsUrn()
     * @see #unsetCrsUrn()
     * @see #setCrsUrn(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCoordinateSystem_CrsUrn()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CoordinateSystem.crsUrn' kind='element'"
     * @generated
     */
    String getCrsUrn();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CoordinateSystem#getCrsUrn <em>Crs Urn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Crs Urn</em>' attribute.
     * @see #isSetCrsUrn()
     * @see #unsetCrsUrn()
     * @see #getCrsUrn()
     * @generated
     */
    void setCrsUrn( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CoordinateSystem#getCrsUrn <em>Crs Urn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCrsUrn()
     * @see #getCrsUrn()
     * @see #setCrsUrn(String)
     * @generated
     */
    void unsetCrsUrn();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CoordinateSystem#getCrsUrn <em>Crs Urn</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Crs Urn</em>' attribute is set.
     * @see #unsetCrsUrn()
     * @see #getCrsUrn()
     * @see #setCrsUrn(String)
     * @generated
     */
    boolean isSetCrsUrn();

    /**
     * Returns the value of the '<em><b>Locations</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Location}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Location#getCoordinateSystem <em>Coordinate System</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Locations</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Locations</em>' reference list.
     * @see #isSetLocations()
     * @see #unsetLocations()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCoordinateSystem_Locations()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Location#getCoordinateSystem
     * @model opposite="CoordinateSystem" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CoordinateSystem.Locations' kind='element'"
     * @generated
     */
    EList< Location > getLocations();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CoordinateSystem#getLocations <em>Locations</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLocations()
     * @see #getLocations()
     * @generated
     */
    void unsetLocations();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CoordinateSystem#getLocations <em>Locations</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Locations</em>' reference list is set.
     * @see #unsetLocations()
     * @see #getLocations()
     * @generated
     */
    boolean isSetLocations();

} // CoordinateSystem
