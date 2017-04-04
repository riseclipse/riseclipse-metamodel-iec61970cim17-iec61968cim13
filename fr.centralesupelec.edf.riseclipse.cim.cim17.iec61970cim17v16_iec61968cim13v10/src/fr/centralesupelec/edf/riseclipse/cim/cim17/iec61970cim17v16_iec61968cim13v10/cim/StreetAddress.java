/**
 *  Copyright (c) 2016 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec : initial implementation
 *  Contacts:
 *      Dominique.Marcadet@centralesupelec.fr
 * 
 */
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Street Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetAddress#getPoBox <em>Po Box</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetAddress#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetAddress#getStatus <em>Status</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetAddress#getStreetDetail <em>Street Detail</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetAddress#getTownDetail <em>Town Detail</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStreetAddress()
 * @model
 * @generated
 */
public interface StreetAddress extends EObject {
    /**
     * Returns the value of the '<em><b>Po Box</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Po Box</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Po Box</em>' attribute.
     * @see #isSetPoBox()
     * @see #unsetPoBox()
     * @see #setPoBox(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStreetAddress_PoBox()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='StreetAddress.poBox' kind='element'"
     * @generated
     */
    String getPoBox();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetAddress#getPoBox <em>Po Box</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Po Box</em>' attribute.
     * @see #isSetPoBox()
     * @see #unsetPoBox()
     * @see #getPoBox()
     * @generated
     */
    void setPoBox( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetAddress#getPoBox <em>Po Box</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPoBox()
     * @see #getPoBox()
     * @see #setPoBox(String)
     * @generated
     */
    void unsetPoBox();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetAddress#getPoBox <em>Po Box</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Po Box</em>' attribute is set.
     * @see #unsetPoBox()
     * @see #getPoBox()
     * @see #setPoBox(String)
     * @generated
     */
    boolean isSetPoBox();

    /**
     * Returns the value of the '<em><b>Postal Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Postal Code</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Postal Code</em>' attribute.
     * @see #isSetPostalCode()
     * @see #unsetPostalCode()
     * @see #setPostalCode(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStreetAddress_PostalCode()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='StreetAddress.postalCode' kind='element'"
     * @generated
     */
    String getPostalCode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetAddress#getPostalCode <em>Postal Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Postal Code</em>' attribute.
     * @see #isSetPostalCode()
     * @see #unsetPostalCode()
     * @see #getPostalCode()
     * @generated
     */
    void setPostalCode( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetAddress#getPostalCode <em>Postal Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPostalCode()
     * @see #getPostalCode()
     * @see #setPostalCode(String)
     * @generated
     */
    void unsetPostalCode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetAddress#getPostalCode <em>Postal Code</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Postal Code</em>' attribute is set.
     * @see #unsetPostalCode()
     * @see #getPostalCode()
     * @see #setPostalCode(String)
     * @generated
     */
    boolean isSetPostalCode();

    /**
     * Returns the value of the '<em><b>Status</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Status</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Status</em>' containment reference.
     * @see #isSetStatus()
     * @see #unsetStatus()
     * @see #setStatus(Status)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStreetAddress_Status()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='StreetAddress.status' kind='element'"
     * @generated
     */
    Status getStatus();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetAddress#getStatus <em>Status</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Status</em>' containment reference.
     * @see #isSetStatus()
     * @see #unsetStatus()
     * @see #getStatus()
     * @generated
     */
    void setStatus( Status value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetAddress#getStatus <em>Status</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStatus()
     * @see #getStatus()
     * @see #setStatus(Status)
     * @generated
     */
    void unsetStatus();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetAddress#getStatus <em>Status</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Status</em>' containment reference is set.
     * @see #unsetStatus()
     * @see #getStatus()
     * @see #setStatus(Status)
     * @generated
     */
    boolean isSetStatus();

    /**
     * Returns the value of the '<em><b>Street Detail</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Street Detail</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Street Detail</em>' containment reference.
     * @see #isSetStreetDetail()
     * @see #unsetStreetDetail()
     * @see #setStreetDetail(StreetDetail)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStreetAddress_StreetDetail()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='StreetAddress.streetDetail' kind='element'"
     * @generated
     */
    StreetDetail getStreetDetail();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetAddress#getStreetDetail <em>Street Detail</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Street Detail</em>' containment reference.
     * @see #isSetStreetDetail()
     * @see #unsetStreetDetail()
     * @see #getStreetDetail()
     * @generated
     */
    void setStreetDetail( StreetDetail value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetAddress#getStreetDetail <em>Street Detail</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStreetDetail()
     * @see #getStreetDetail()
     * @see #setStreetDetail(StreetDetail)
     * @generated
     */
    void unsetStreetDetail();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetAddress#getStreetDetail <em>Street Detail</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Street Detail</em>' containment reference is set.
     * @see #unsetStreetDetail()
     * @see #getStreetDetail()
     * @see #setStreetDetail(StreetDetail)
     * @generated
     */
    boolean isSetStreetDetail();

    /**
     * Returns the value of the '<em><b>Town Detail</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Town Detail</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Town Detail</em>' containment reference.
     * @see #isSetTownDetail()
     * @see #unsetTownDetail()
     * @see #setTownDetail(TownDetail)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStreetAddress_TownDetail()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='StreetAddress.townDetail' kind='element'"
     * @generated
     */
    TownDetail getTownDetail();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetAddress#getTownDetail <em>Town Detail</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Town Detail</em>' containment reference.
     * @see #isSetTownDetail()
     * @see #unsetTownDetail()
     * @see #getTownDetail()
     * @generated
     */
    void setTownDetail( TownDetail value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetAddress#getTownDetail <em>Town Detail</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTownDetail()
     * @see #getTownDetail()
     * @see #setTownDetail(TownDetail)
     * @generated
     */
    void unsetTownDetail();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetAddress#getTownDetail <em>Town Detail</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Town Detail</em>' containment reference is set.
     * @see #unsetTownDetail()
     * @see #getTownDetail()
     * @see #setTownDetail(TownDetail)
     * @generated
     */
    boolean isSetTownDetail();

} // StreetAddress
