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
 * A representation of the model object '<em><b>Alt Generating Unit Meas</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AltGeneratingUnitMeas#getPriority <em>Priority</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AltGeneratingUnitMeas#getAnalogValue <em>Analog Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AltGeneratingUnitMeas#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAltGeneratingUnitMeas()
 * @model
 * @generated
 */
public interface AltGeneratingUnitMeas extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Priority</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Priority</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Priority</em>' attribute.
     * @see #isSetPriority()
     * @see #unsetPriority()
     * @see #setPriority(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAltGeneratingUnitMeas_Priority()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AltGeneratingUnitMeas.priority' kind='element'"
     * @generated
     */
    Integer getPriority();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AltGeneratingUnitMeas#getPriority <em>Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Priority</em>' attribute.
     * @see #isSetPriority()
     * @see #unsetPriority()
     * @see #getPriority()
     * @generated
     */
    void setPriority( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AltGeneratingUnitMeas#getPriority <em>Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPriority()
     * @see #getPriority()
     * @see #setPriority(Integer)
     * @generated
     */
    void unsetPriority();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AltGeneratingUnitMeas#getPriority <em>Priority</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Priority</em>' attribute is set.
     * @see #unsetPriority()
     * @see #getPriority()
     * @see #setPriority(Integer)
     * @generated
     */
    boolean isSetPriority();

    /**
     * Returns the value of the '<em><b>Analog Value</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalogValue#getAltGeneratingUnit <em>Alt Generating Unit</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Analog Value</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Analog Value</em>' reference.
     * @see #isSetAnalogValue()
     * @see #unsetAnalogValue()
     * @see #setAnalogValue(AnalogValue)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAltGeneratingUnitMeas_AnalogValue()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalogValue#getAltGeneratingUnit
     * @model opposite="AltGeneratingUnit" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AltGeneratingUnitMeas.AnalogValue' kind='element'"
     * @generated
     */
    AnalogValue getAnalogValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AltGeneratingUnitMeas#getAnalogValue <em>Analog Value</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Analog Value</em>' reference.
     * @see #isSetAnalogValue()
     * @see #unsetAnalogValue()
     * @see #getAnalogValue()
     * @generated
     */
    void setAnalogValue( AnalogValue value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AltGeneratingUnitMeas#getAnalogValue <em>Analog Value</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAnalogValue()
     * @see #getAnalogValue()
     * @see #setAnalogValue(AnalogValue)
     * @generated
     */
    void unsetAnalogValue();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AltGeneratingUnitMeas#getAnalogValue <em>Analog Value</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Analog Value</em>' reference is set.
     * @see #unsetAnalogValue()
     * @see #getAnalogValue()
     * @see #setAnalogValue(AnalogValue)
     * @generated
     */
    boolean isSetAnalogValue();

    /**
     * Returns the value of the '<em><b>Control Area Generating Unit</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlAreaGeneratingUnit#getAltGeneratingUnitMeas <em>Alt Generating Unit Meas</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Control Area Generating Unit</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Control Area Generating Unit</em>' reference.
     * @see #isSetControlAreaGeneratingUnit()
     * @see #unsetControlAreaGeneratingUnit()
     * @see #setControlAreaGeneratingUnit(ControlAreaGeneratingUnit)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAltGeneratingUnitMeas_ControlAreaGeneratingUnit()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlAreaGeneratingUnit#getAltGeneratingUnitMeas
     * @model opposite="AltGeneratingUnitMeas" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AltGeneratingUnitMeas.ControlAreaGeneratingUnit' kind='element'"
     * @generated
     */
    ControlAreaGeneratingUnit getControlAreaGeneratingUnit();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AltGeneratingUnitMeas#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Control Area Generating Unit</em>' reference.
     * @see #isSetControlAreaGeneratingUnit()
     * @see #unsetControlAreaGeneratingUnit()
     * @see #getControlAreaGeneratingUnit()
     * @generated
     */
    void setControlAreaGeneratingUnit( ControlAreaGeneratingUnit value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AltGeneratingUnitMeas#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetControlAreaGeneratingUnit()
     * @see #getControlAreaGeneratingUnit()
     * @see #setControlAreaGeneratingUnit(ControlAreaGeneratingUnit)
     * @generated
     */
    void unsetControlAreaGeneratingUnit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AltGeneratingUnitMeas#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Control Area Generating Unit</em>' reference is set.
     * @see #unsetControlAreaGeneratingUnit()
     * @see #getControlAreaGeneratingUnit()
     * @see #setControlAreaGeneratingUnit(ControlAreaGeneratingUnit)
     * @generated
     */
    boolean isSetControlAreaGeneratingUnit();

} // AltGeneratingUnitMeas
