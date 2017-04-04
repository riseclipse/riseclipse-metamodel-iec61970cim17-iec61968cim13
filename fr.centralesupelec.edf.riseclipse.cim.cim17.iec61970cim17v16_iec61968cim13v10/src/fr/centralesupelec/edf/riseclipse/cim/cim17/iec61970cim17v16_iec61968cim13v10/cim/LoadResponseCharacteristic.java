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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Response Characteristic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic#getExponentModel <em>Exponent Model</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic#getPConstantCurrent <em>PConstant Current</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic#getPConstantImpedance <em>PConstant Impedance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic#getPConstantPower <em>PConstant Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic#getPFrequencyExponent <em>PFrequency Exponent</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic#getPVoltageExponent <em>PVoltage Exponent</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic#getQConstantCurrent <em>QConstant Current</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic#getQConstantImpedance <em>QConstant Impedance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic#getQConstantPower <em>QConstant Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic#getQFrequencyExponent <em>QFrequency Exponent</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic#getQVoltageExponent <em>QVoltage Exponent</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic#getEnergyConsumer <em>Energy Consumer</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadResponseCharacteristic()
 * @model
 * @generated
 */
public interface LoadResponseCharacteristic extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Exponent Model</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Exponent Model</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Exponent Model</em>' attribute.
     * @see #isSetExponentModel()
     * @see #unsetExponentModel()
     * @see #setExponentModel(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadResponseCharacteristic_ExponentModel()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadResponseCharacteristic.exponentModel' kind='element'"
     * @generated
     */
    Boolean getExponentModel();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic#getExponentModel <em>Exponent Model</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Exponent Model</em>' attribute.
     * @see #isSetExponentModel()
     * @see #unsetExponentModel()
     * @see #getExponentModel()
     * @generated
     */
    void setExponentModel( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic#getExponentModel <em>Exponent Model</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetExponentModel()
     * @see #getExponentModel()
     * @see #setExponentModel(Boolean)
     * @generated
     */
    void unsetExponentModel();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic#getExponentModel <em>Exponent Model</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Exponent Model</em>' attribute is set.
     * @see #unsetExponentModel()
     * @see #getExponentModel()
     * @see #setExponentModel(Boolean)
     * @generated
     */
    boolean isSetExponentModel();

    /**
     * Returns the value of the '<em><b>PConstant Current</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PConstant Current</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PConstant Current</em>' attribute.
     * @see #isSetPConstantCurrent()
     * @see #unsetPConstantCurrent()
     * @see #setPConstantCurrent(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadResponseCharacteristic_PConstantCurrent()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadResponseCharacteristic.pConstantCurrent' kind='element'"
     * @generated
     */
    Float getPConstantCurrent();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic#getPConstantCurrent <em>PConstant Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PConstant Current</em>' attribute.
     * @see #isSetPConstantCurrent()
     * @see #unsetPConstantCurrent()
     * @see #getPConstantCurrent()
     * @generated
     */
    void setPConstantCurrent( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic#getPConstantCurrent <em>PConstant Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPConstantCurrent()
     * @see #getPConstantCurrent()
     * @see #setPConstantCurrent(Float)
     * @generated
     */
    void unsetPConstantCurrent();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic#getPConstantCurrent <em>PConstant Current</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>PConstant Current</em>' attribute is set.
     * @see #unsetPConstantCurrent()
     * @see #getPConstantCurrent()
     * @see #setPConstantCurrent(Float)
     * @generated
     */
    boolean isSetPConstantCurrent();

    /**
     * Returns the value of the '<em><b>PConstant Impedance</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PConstant Impedance</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PConstant Impedance</em>' attribute.
     * @see #isSetPConstantImpedance()
     * @see #unsetPConstantImpedance()
     * @see #setPConstantImpedance(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadResponseCharacteristic_PConstantImpedance()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadResponseCharacteristic.pConstantImpedance' kind='element'"
     * @generated
     */
    Float getPConstantImpedance();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic#getPConstantImpedance <em>PConstant Impedance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PConstant Impedance</em>' attribute.
     * @see #isSetPConstantImpedance()
     * @see #unsetPConstantImpedance()
     * @see #getPConstantImpedance()
     * @generated
     */
    void setPConstantImpedance( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic#getPConstantImpedance <em>PConstant Impedance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPConstantImpedance()
     * @see #getPConstantImpedance()
     * @see #setPConstantImpedance(Float)
     * @generated
     */
    void unsetPConstantImpedance();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic#getPConstantImpedance <em>PConstant Impedance</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>PConstant Impedance</em>' attribute is set.
     * @see #unsetPConstantImpedance()
     * @see #getPConstantImpedance()
     * @see #setPConstantImpedance(Float)
     * @generated
     */
    boolean isSetPConstantImpedance();

    /**
     * Returns the value of the '<em><b>PConstant Power</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PConstant Power</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PConstant Power</em>' attribute.
     * @see #isSetPConstantPower()
     * @see #unsetPConstantPower()
     * @see #setPConstantPower(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadResponseCharacteristic_PConstantPower()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadResponseCharacteristic.pConstantPower' kind='element'"
     * @generated
     */
    Float getPConstantPower();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic#getPConstantPower <em>PConstant Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PConstant Power</em>' attribute.
     * @see #isSetPConstantPower()
     * @see #unsetPConstantPower()
     * @see #getPConstantPower()
     * @generated
     */
    void setPConstantPower( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic#getPConstantPower <em>PConstant Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPConstantPower()
     * @see #getPConstantPower()
     * @see #setPConstantPower(Float)
     * @generated
     */
    void unsetPConstantPower();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic#getPConstantPower <em>PConstant Power</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>PConstant Power</em>' attribute is set.
     * @see #unsetPConstantPower()
     * @see #getPConstantPower()
     * @see #setPConstantPower(Float)
     * @generated
     */
    boolean isSetPConstantPower();

    /**
     * Returns the value of the '<em><b>PFrequency Exponent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PFrequency Exponent</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PFrequency Exponent</em>' attribute.
     * @see #isSetPFrequencyExponent()
     * @see #unsetPFrequencyExponent()
     * @see #setPFrequencyExponent(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadResponseCharacteristic_PFrequencyExponent()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadResponseCharacteristic.pFrequencyExponent' kind='element'"
     * @generated
     */
    Float getPFrequencyExponent();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic#getPFrequencyExponent <em>PFrequency Exponent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PFrequency Exponent</em>' attribute.
     * @see #isSetPFrequencyExponent()
     * @see #unsetPFrequencyExponent()
     * @see #getPFrequencyExponent()
     * @generated
     */
    void setPFrequencyExponent( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic#getPFrequencyExponent <em>PFrequency Exponent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPFrequencyExponent()
     * @see #getPFrequencyExponent()
     * @see #setPFrequencyExponent(Float)
     * @generated
     */
    void unsetPFrequencyExponent();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic#getPFrequencyExponent <em>PFrequency Exponent</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>PFrequency Exponent</em>' attribute is set.
     * @see #unsetPFrequencyExponent()
     * @see #getPFrequencyExponent()
     * @see #setPFrequencyExponent(Float)
     * @generated
     */
    boolean isSetPFrequencyExponent();

    /**
     * Returns the value of the '<em><b>PVoltage Exponent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PVoltage Exponent</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PVoltage Exponent</em>' attribute.
     * @see #isSetPVoltageExponent()
     * @see #unsetPVoltageExponent()
     * @see #setPVoltageExponent(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadResponseCharacteristic_PVoltageExponent()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadResponseCharacteristic.pVoltageExponent' kind='element'"
     * @generated
     */
    Float getPVoltageExponent();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic#getPVoltageExponent <em>PVoltage Exponent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PVoltage Exponent</em>' attribute.
     * @see #isSetPVoltageExponent()
     * @see #unsetPVoltageExponent()
     * @see #getPVoltageExponent()
     * @generated
     */
    void setPVoltageExponent( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic#getPVoltageExponent <em>PVoltage Exponent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPVoltageExponent()
     * @see #getPVoltageExponent()
     * @see #setPVoltageExponent(Float)
     * @generated
     */
    void unsetPVoltageExponent();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic#getPVoltageExponent <em>PVoltage Exponent</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>PVoltage Exponent</em>' attribute is set.
     * @see #unsetPVoltageExponent()
     * @see #getPVoltageExponent()
     * @see #setPVoltageExponent(Float)
     * @generated
     */
    boolean isSetPVoltageExponent();

    /**
     * Returns the value of the '<em><b>QConstant Current</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>QConstant Current</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>QConstant Current</em>' attribute.
     * @see #isSetQConstantCurrent()
     * @see #unsetQConstantCurrent()
     * @see #setQConstantCurrent(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadResponseCharacteristic_QConstantCurrent()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadResponseCharacteristic.qConstantCurrent' kind='element'"
     * @generated
     */
    Float getQConstantCurrent();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic#getQConstantCurrent <em>QConstant Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>QConstant Current</em>' attribute.
     * @see #isSetQConstantCurrent()
     * @see #unsetQConstantCurrent()
     * @see #getQConstantCurrent()
     * @generated
     */
    void setQConstantCurrent( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic#getQConstantCurrent <em>QConstant Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQConstantCurrent()
     * @see #getQConstantCurrent()
     * @see #setQConstantCurrent(Float)
     * @generated
     */
    void unsetQConstantCurrent();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic#getQConstantCurrent <em>QConstant Current</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>QConstant Current</em>' attribute is set.
     * @see #unsetQConstantCurrent()
     * @see #getQConstantCurrent()
     * @see #setQConstantCurrent(Float)
     * @generated
     */
    boolean isSetQConstantCurrent();

    /**
     * Returns the value of the '<em><b>QConstant Impedance</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>QConstant Impedance</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>QConstant Impedance</em>' attribute.
     * @see #isSetQConstantImpedance()
     * @see #unsetQConstantImpedance()
     * @see #setQConstantImpedance(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadResponseCharacteristic_QConstantImpedance()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadResponseCharacteristic.qConstantImpedance' kind='element'"
     * @generated
     */
    Float getQConstantImpedance();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic#getQConstantImpedance <em>QConstant Impedance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>QConstant Impedance</em>' attribute.
     * @see #isSetQConstantImpedance()
     * @see #unsetQConstantImpedance()
     * @see #getQConstantImpedance()
     * @generated
     */
    void setQConstantImpedance( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic#getQConstantImpedance <em>QConstant Impedance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQConstantImpedance()
     * @see #getQConstantImpedance()
     * @see #setQConstantImpedance(Float)
     * @generated
     */
    void unsetQConstantImpedance();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic#getQConstantImpedance <em>QConstant Impedance</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>QConstant Impedance</em>' attribute is set.
     * @see #unsetQConstantImpedance()
     * @see #getQConstantImpedance()
     * @see #setQConstantImpedance(Float)
     * @generated
     */
    boolean isSetQConstantImpedance();

    /**
     * Returns the value of the '<em><b>QConstant Power</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>QConstant Power</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>QConstant Power</em>' attribute.
     * @see #isSetQConstantPower()
     * @see #unsetQConstantPower()
     * @see #setQConstantPower(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadResponseCharacteristic_QConstantPower()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadResponseCharacteristic.qConstantPower' kind='element'"
     * @generated
     */
    Float getQConstantPower();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic#getQConstantPower <em>QConstant Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>QConstant Power</em>' attribute.
     * @see #isSetQConstantPower()
     * @see #unsetQConstantPower()
     * @see #getQConstantPower()
     * @generated
     */
    void setQConstantPower( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic#getQConstantPower <em>QConstant Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQConstantPower()
     * @see #getQConstantPower()
     * @see #setQConstantPower(Float)
     * @generated
     */
    void unsetQConstantPower();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic#getQConstantPower <em>QConstant Power</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>QConstant Power</em>' attribute is set.
     * @see #unsetQConstantPower()
     * @see #getQConstantPower()
     * @see #setQConstantPower(Float)
     * @generated
     */
    boolean isSetQConstantPower();

    /**
     * Returns the value of the '<em><b>QFrequency Exponent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>QFrequency Exponent</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>QFrequency Exponent</em>' attribute.
     * @see #isSetQFrequencyExponent()
     * @see #unsetQFrequencyExponent()
     * @see #setQFrequencyExponent(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadResponseCharacteristic_QFrequencyExponent()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadResponseCharacteristic.qFrequencyExponent' kind='element'"
     * @generated
     */
    Float getQFrequencyExponent();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic#getQFrequencyExponent <em>QFrequency Exponent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>QFrequency Exponent</em>' attribute.
     * @see #isSetQFrequencyExponent()
     * @see #unsetQFrequencyExponent()
     * @see #getQFrequencyExponent()
     * @generated
     */
    void setQFrequencyExponent( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic#getQFrequencyExponent <em>QFrequency Exponent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQFrequencyExponent()
     * @see #getQFrequencyExponent()
     * @see #setQFrequencyExponent(Float)
     * @generated
     */
    void unsetQFrequencyExponent();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic#getQFrequencyExponent <em>QFrequency Exponent</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>QFrequency Exponent</em>' attribute is set.
     * @see #unsetQFrequencyExponent()
     * @see #getQFrequencyExponent()
     * @see #setQFrequencyExponent(Float)
     * @generated
     */
    boolean isSetQFrequencyExponent();

    /**
     * Returns the value of the '<em><b>QVoltage Exponent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>QVoltage Exponent</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>QVoltage Exponent</em>' attribute.
     * @see #isSetQVoltageExponent()
     * @see #unsetQVoltageExponent()
     * @see #setQVoltageExponent(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadResponseCharacteristic_QVoltageExponent()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadResponseCharacteristic.qVoltageExponent' kind='element'"
     * @generated
     */
    Float getQVoltageExponent();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic#getQVoltageExponent <em>QVoltage Exponent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>QVoltage Exponent</em>' attribute.
     * @see #isSetQVoltageExponent()
     * @see #unsetQVoltageExponent()
     * @see #getQVoltageExponent()
     * @generated
     */
    void setQVoltageExponent( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic#getQVoltageExponent <em>QVoltage Exponent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQVoltageExponent()
     * @see #getQVoltageExponent()
     * @see #setQVoltageExponent(Float)
     * @generated
     */
    void unsetQVoltageExponent();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic#getQVoltageExponent <em>QVoltage Exponent</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>QVoltage Exponent</em>' attribute is set.
     * @see #unsetQVoltageExponent()
     * @see #getQVoltageExponent()
     * @see #setQVoltageExponent(Float)
     * @generated
     */
    boolean isSetQVoltageExponent();

    /**
     * Returns the value of the '<em><b>Energy Consumer</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getLoadResponse <em>Load Response</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Energy Consumer</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Energy Consumer</em>' reference list.
     * @see #isSetEnergyConsumer()
     * @see #unsetEnergyConsumer()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadResponseCharacteristic_EnergyConsumer()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getLoadResponse
     * @model opposite="LoadResponse" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadResponseCharacteristic.EnergyConsumer' kind='element'"
     * @generated
     */
    EList< EnergyConsumer > getEnergyConsumer();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic#getEnergyConsumer <em>Energy Consumer</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEnergyConsumer()
     * @see #getEnergyConsumer()
     * @generated
     */
    void unsetEnergyConsumer();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadResponseCharacteristic#getEnergyConsumer <em>Energy Consumer</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Energy Consumer</em>' reference list is set.
     * @see #unsetEnergyConsumer()
     * @see #getEnergyConsumer()
     * @generated
     */
    boolean isSetEnergyConsumer();

} // LoadResponseCharacteristic
