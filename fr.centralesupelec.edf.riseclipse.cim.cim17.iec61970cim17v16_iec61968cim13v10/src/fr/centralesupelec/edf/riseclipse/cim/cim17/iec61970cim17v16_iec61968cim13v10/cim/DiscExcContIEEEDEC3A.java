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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disc Exc Cont IEEEDEC3A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC3A#getTdr <em>Tdr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC3A#getVtmin <em>Vtmin</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiscExcContIEEEDEC3A()
 * @model
 * @generated
 */
public interface DiscExcContIEEEDEC3A extends DiscontinuousExcitationControlDynamics {
    /**
     * Returns the value of the '<em><b>Tdr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tdr</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tdr</em>' attribute.
     * @see #isSetTdr()
     * @see #unsetTdr()
     * @see #setTdr(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiscExcContIEEEDEC3A_Tdr()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiscExcContIEEEDEC3A.tdr' kind='element'"
     * @generated
     */
    Float getTdr();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC3A#getTdr <em>Tdr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tdr</em>' attribute.
     * @see #isSetTdr()
     * @see #unsetTdr()
     * @see #getTdr()
     * @generated
     */
    void setTdr( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC3A#getTdr <em>Tdr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTdr()
     * @see #getTdr()
     * @see #setTdr(Float)
     * @generated
     */
    void unsetTdr();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC3A#getTdr <em>Tdr</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tdr</em>' attribute is set.
     * @see #unsetTdr()
     * @see #getTdr()
     * @see #setTdr(Float)
     * @generated
     */
    boolean isSetTdr();

    /**
     * Returns the value of the '<em><b>Vtmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vtmin</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vtmin</em>' attribute.
     * @see #isSetVtmin()
     * @see #unsetVtmin()
     * @see #setVtmin(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDiscExcContIEEEDEC3A_Vtmin()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DiscExcContIEEEDEC3A.vtmin' kind='element'"
     * @generated
     */
    Float getVtmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC3A#getVtmin <em>Vtmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vtmin</em>' attribute.
     * @see #isSetVtmin()
     * @see #unsetVtmin()
     * @see #getVtmin()
     * @generated
     */
    void setVtmin( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC3A#getVtmin <em>Vtmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVtmin()
     * @see #getVtmin()
     * @see #setVtmin(Float)
     * @generated
     */
    void unsetVtmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC3A#getVtmin <em>Vtmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vtmin</em>' attribute is set.
     * @see #unsetVtmin()
     * @see #getVtmin()
     * @see #setVtmin(Float)
     * @generated
     */
    boolean isSetVtmin();

} // DiscExcContIEEEDEC3A
