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
 * A representation of the model object '<em><b>Other Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OtherCapability#getCapabilitySubType <em>Capability Sub Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OtherCapability#getCapabilityType <em>Capability Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OtherCapability#getCapabilityUnits <em>Capability Units</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OtherCapability#getCapabilityValue <em>Capability Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OtherCapability#getEndDeviceGroup <em>End Device Group</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OtherCapability#getEndDevice <em>End Device</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OtherCapability#getDERGroupForecast <em>DER Group Forecast</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOtherCapability()
 * @model
 * @generated
 */
public interface OtherCapability extends DERCapabilities {
    /**
     * Returns the value of the '<em><b>Capability Sub Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Capability Sub Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Capability Sub Type</em>' attribute.
     * @see #isSetCapabilitySubType()
     * @see #unsetCapabilitySubType()
     * @see #setCapabilitySubType(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOtherCapability_CapabilitySubType()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='OtherCapability.capabilitySubType' kind='element'"
     * @generated
     */
    String getCapabilitySubType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OtherCapability#getCapabilitySubType <em>Capability Sub Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Capability Sub Type</em>' attribute.
     * @see #isSetCapabilitySubType()
     * @see #unsetCapabilitySubType()
     * @see #getCapabilitySubType()
     * @generated
     */
    void setCapabilitySubType( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OtherCapability#getCapabilitySubType <em>Capability Sub Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCapabilitySubType()
     * @see #getCapabilitySubType()
     * @see #setCapabilitySubType(String)
     * @generated
     */
    void unsetCapabilitySubType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OtherCapability#getCapabilitySubType <em>Capability Sub Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Capability Sub Type</em>' attribute is set.
     * @see #unsetCapabilitySubType()
     * @see #getCapabilitySubType()
     * @see #setCapabilitySubType(String)
     * @generated
     */
    boolean isSetCapabilitySubType();

    /**
     * Returns the value of the '<em><b>Capability Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Capability Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Capability Type</em>' attribute.
     * @see #isSetCapabilityType()
     * @see #unsetCapabilityType()
     * @see #setCapabilityType(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOtherCapability_CapabilityType()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='OtherCapability.capabilityType' kind='element'"
     * @generated
     */
    String getCapabilityType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OtherCapability#getCapabilityType <em>Capability Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Capability Type</em>' attribute.
     * @see #isSetCapabilityType()
     * @see #unsetCapabilityType()
     * @see #getCapabilityType()
     * @generated
     */
    void setCapabilityType( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OtherCapability#getCapabilityType <em>Capability Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCapabilityType()
     * @see #getCapabilityType()
     * @see #setCapabilityType(String)
     * @generated
     */
    void unsetCapabilityType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OtherCapability#getCapabilityType <em>Capability Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Capability Type</em>' attribute is set.
     * @see #unsetCapabilityType()
     * @see #getCapabilityType()
     * @see #setCapabilityType(String)
     * @generated
     */
    boolean isSetCapabilityType();

    /**
     * Returns the value of the '<em><b>Capability Units</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Capability Units</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Capability Units</em>' attribute.
     * @see #isSetCapabilityUnits()
     * @see #unsetCapabilityUnits()
     * @see #setCapabilityUnits(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOtherCapability_CapabilityUnits()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='OtherCapability.capabilityUnits' kind='element'"
     * @generated
     */
    String getCapabilityUnits();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OtherCapability#getCapabilityUnits <em>Capability Units</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Capability Units</em>' attribute.
     * @see #isSetCapabilityUnits()
     * @see #unsetCapabilityUnits()
     * @see #getCapabilityUnits()
     * @generated
     */
    void setCapabilityUnits( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OtherCapability#getCapabilityUnits <em>Capability Units</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCapabilityUnits()
     * @see #getCapabilityUnits()
     * @see #setCapabilityUnits(String)
     * @generated
     */
    void unsetCapabilityUnits();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OtherCapability#getCapabilityUnits <em>Capability Units</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Capability Units</em>' attribute is set.
     * @see #unsetCapabilityUnits()
     * @see #getCapabilityUnits()
     * @see #setCapabilityUnits(String)
     * @generated
     */
    boolean isSetCapabilityUnits();

    /**
     * Returns the value of the '<em><b>Capability Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Capability Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Capability Value</em>' attribute.
     * @see #isSetCapabilityValue()
     * @see #unsetCapabilityValue()
     * @see #setCapabilityValue(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOtherCapability_CapabilityValue()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='OtherCapability.capabilityValue' kind='element'"
     * @generated
     */
    String getCapabilityValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OtherCapability#getCapabilityValue <em>Capability Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Capability Value</em>' attribute.
     * @see #isSetCapabilityValue()
     * @see #unsetCapabilityValue()
     * @see #getCapabilityValue()
     * @generated
     */
    void setCapabilityValue( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OtherCapability#getCapabilityValue <em>Capability Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCapabilityValue()
     * @see #getCapabilityValue()
     * @see #setCapabilityValue(String)
     * @generated
     */
    void unsetCapabilityValue();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OtherCapability#getCapabilityValue <em>Capability Value</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Capability Value</em>' attribute is set.
     * @see #unsetCapabilityValue()
     * @see #getCapabilityValue()
     * @see #setCapabilityValue(String)
     * @generated
     */
    boolean isSetCapabilityValue();

    /**
     * Returns the value of the '<em><b>End Device Group</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceGroup#getOtherCapability <em>Other Capability</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>End Device Group</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>End Device Group</em>' reference.
     * @see #isSetEndDeviceGroup()
     * @see #unsetEndDeviceGroup()
     * @see #setEndDeviceGroup(EndDeviceGroup)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOtherCapability_EndDeviceGroup()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceGroup#getOtherCapability
     * @model opposite="OtherCapability" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='OtherCapability.EndDeviceGroup' kind='element'"
     * @generated
     */
    EndDeviceGroup getEndDeviceGroup();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OtherCapability#getEndDeviceGroup <em>End Device Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>End Device Group</em>' reference.
     * @see #isSetEndDeviceGroup()
     * @see #unsetEndDeviceGroup()
     * @see #getEndDeviceGroup()
     * @generated
     */
    void setEndDeviceGroup( EndDeviceGroup value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OtherCapability#getEndDeviceGroup <em>End Device Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEndDeviceGroup()
     * @see #getEndDeviceGroup()
     * @see #setEndDeviceGroup(EndDeviceGroup)
     * @generated
     */
    void unsetEndDeviceGroup();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OtherCapability#getEndDeviceGroup <em>End Device Group</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>End Device Group</em>' reference is set.
     * @see #unsetEndDeviceGroup()
     * @see #getEndDeviceGroup()
     * @see #setEndDeviceGroup(EndDeviceGroup)
     * @generated
     */
    boolean isSetEndDeviceGroup();

    /**
     * Returns the value of the '<em><b>End Device</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getOtherCapability <em>Other Capability</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>End Device</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>End Device</em>' reference.
     * @see #isSetEndDevice()
     * @see #unsetEndDevice()
     * @see #setEndDevice(EndDevice)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOtherCapability_EndDevice()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getOtherCapability
     * @model opposite="OtherCapability" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='OtherCapability.EndDevice' kind='element'"
     * @generated
     */
    EndDevice getEndDevice();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OtherCapability#getEndDevice <em>End Device</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>End Device</em>' reference.
     * @see #isSetEndDevice()
     * @see #unsetEndDevice()
     * @see #getEndDevice()
     * @generated
     */
    void setEndDevice( EndDevice value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OtherCapability#getEndDevice <em>End Device</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEndDevice()
     * @see #getEndDevice()
     * @see #setEndDevice(EndDevice)
     * @generated
     */
    void unsetEndDevice();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OtherCapability#getEndDevice <em>End Device</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>End Device</em>' reference is set.
     * @see #unsetEndDevice()
     * @see #getEndDevice()
     * @see #setEndDevice(EndDevice)
     * @generated
     */
    boolean isSetEndDevice();

    /**
     * Returns the value of the '<em><b>DER Group Forecast</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Predictions}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Predictions#getOtherCapability <em>Other Capability</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DER Group Forecast</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DER Group Forecast</em>' reference list.
     * @see #isSetDERGroupForecast()
     * @see #unsetDERGroupForecast()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOtherCapability_DERGroupForecast()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Predictions#getOtherCapability
     * @model opposite="OtherCapability" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='OtherCapability.DERGroupForecast' kind='element'"
     * @generated
     */
    EList< Predictions > getDERGroupForecast();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OtherCapability#getDERGroupForecast <em>DER Group Forecast</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDERGroupForecast()
     * @see #getDERGroupForecast()
     * @generated
     */
    void unsetDERGroupForecast();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OtherCapability#getDERGroupForecast <em>DER Group Forecast</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>DER Group Forecast</em>' reference list is set.
     * @see #unsetDERGroupForecast()
     * @see #getDERGroupForecast()
     * @generated
     */
    boolean isSetDERGroupForecast();

} // OtherCapability
