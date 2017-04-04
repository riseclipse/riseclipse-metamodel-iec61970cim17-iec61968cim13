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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emission Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EmissionAccount#getEmissionType <em>Emission Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EmissionAccount#getEmissionValueSource <em>Emission Value Source</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EmissionAccount#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEmissionAccount()
 * @model
 * @generated
 */
public interface EmissionAccount extends Curve {
    /**
     * Returns the value of the '<em><b>Emission Type</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EmissionType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Emission Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Emission Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EmissionType
     * @see #isSetEmissionType()
     * @see #unsetEmissionType()
     * @see #setEmissionType(EmissionType)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEmissionAccount_EmissionType()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EmissionAccount.emissionType' kind='element'"
     * @generated
     */
    EmissionType getEmissionType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EmissionAccount#getEmissionType <em>Emission Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Emission Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EmissionType
     * @see #isSetEmissionType()
     * @see #unsetEmissionType()
     * @see #getEmissionType()
     * @generated
     */
    void setEmissionType( EmissionType value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EmissionAccount#getEmissionType <em>Emission Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEmissionType()
     * @see #getEmissionType()
     * @see #setEmissionType(EmissionType)
     * @generated
     */
    void unsetEmissionType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EmissionAccount#getEmissionType <em>Emission Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Emission Type</em>' attribute is set.
     * @see #unsetEmissionType()
     * @see #getEmissionType()
     * @see #setEmissionType(EmissionType)
     * @generated
     */
    boolean isSetEmissionType();

    /**
     * Returns the value of the '<em><b>Emission Value Source</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EmissionValueSource}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Emission Value Source</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Emission Value Source</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EmissionValueSource
     * @see #isSetEmissionValueSource()
     * @see #unsetEmissionValueSource()
     * @see #setEmissionValueSource(EmissionValueSource)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEmissionAccount_EmissionValueSource()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EmissionAccount.emissionValueSource' kind='element'"
     * @generated
     */
    EmissionValueSource getEmissionValueSource();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EmissionAccount#getEmissionValueSource <em>Emission Value Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Emission Value Source</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EmissionValueSource
     * @see #isSetEmissionValueSource()
     * @see #unsetEmissionValueSource()
     * @see #getEmissionValueSource()
     * @generated
     */
    void setEmissionValueSource( EmissionValueSource value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EmissionAccount#getEmissionValueSource <em>Emission Value Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEmissionValueSource()
     * @see #getEmissionValueSource()
     * @see #setEmissionValueSource(EmissionValueSource)
     * @generated
     */
    void unsetEmissionValueSource();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EmissionAccount#getEmissionValueSource <em>Emission Value Source</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Emission Value Source</em>' attribute is set.
     * @see #unsetEmissionValueSource()
     * @see #getEmissionValueSource()
     * @see #setEmissionValueSource(EmissionValueSource)
     * @generated
     */
    boolean isSetEmissionValueSource();

    /**
     * Returns the value of the '<em><b>Thermal Generating Unit</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getEmmissionAccounts <em>Emmission Accounts</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Thermal Generating Unit</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Thermal Generating Unit</em>' reference.
     * @see #isSetThermalGeneratingUnit()
     * @see #unsetThermalGeneratingUnit()
     * @see #setThermalGeneratingUnit(ThermalGeneratingUnit)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEmissionAccount_ThermalGeneratingUnit()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getEmmissionAccounts
     * @model opposite="EmmissionAccounts" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EmissionAccount.ThermalGeneratingUnit' kind='element'"
     * @generated
     */
    ThermalGeneratingUnit getThermalGeneratingUnit();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EmissionAccount#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Thermal Generating Unit</em>' reference.
     * @see #isSetThermalGeneratingUnit()
     * @see #unsetThermalGeneratingUnit()
     * @see #getThermalGeneratingUnit()
     * @generated
     */
    void setThermalGeneratingUnit( ThermalGeneratingUnit value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EmissionAccount#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetThermalGeneratingUnit()
     * @see #getThermalGeneratingUnit()
     * @see #setThermalGeneratingUnit(ThermalGeneratingUnit)
     * @generated
     */
    void unsetThermalGeneratingUnit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EmissionAccount#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Thermal Generating Unit</em>' reference is set.
     * @see #unsetThermalGeneratingUnit()
     * @see #getThermalGeneratingUnit()
     * @see #setThermalGeneratingUnit(ThermalGeneratingUnit)
     * @generated
     */
    boolean isSetThermalGeneratingUnit();

} // EmissionAccount
