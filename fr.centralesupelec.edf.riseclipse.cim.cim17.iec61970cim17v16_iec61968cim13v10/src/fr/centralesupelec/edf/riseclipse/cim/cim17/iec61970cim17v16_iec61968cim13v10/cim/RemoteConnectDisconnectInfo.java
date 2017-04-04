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

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remote Connect Disconnect Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo#getArmedTimeout <em>Armed Timeout</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo#getCustomerVoltageLimit <em>Customer Voltage Limit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo#getEnergyLimit <em>Energy Limit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo#getEnergyUsageStartDateTime <em>Energy Usage Start Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo#getEnergyUsageWarning <em>Energy Usage Warning</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo#getIsArmConnect <em>Is Arm Connect</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo#getIsArmDisconnect <em>Is Arm Disconnect</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo#getIsEnergyLimiting <em>Is Energy Limiting</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo#getNeedsPowerLimitCheck <em>Needs Power Limit Check</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo#getNeedsVoltageLimitCheck <em>Needs Voltage Limit Check</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo#getPowerLimit <em>Power Limit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo#getUsePushbutton <em>Use Pushbutton</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRemoteConnectDisconnectInfo()
 * @model
 * @generated
 */
public interface RemoteConnectDisconnectInfo extends EObject {
    /**
     * Returns the value of the '<em><b>Armed Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Armed Timeout</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Armed Timeout</em>' attribute.
     * @see #isSetArmedTimeout()
     * @see #unsetArmedTimeout()
     * @see #setArmedTimeout(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRemoteConnectDisconnectInfo_ArmedTimeout()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RemoteConnectDisconnectInfo.armedTimeout' kind='element'"
     * @generated
     */
    Float getArmedTimeout();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo#getArmedTimeout <em>Armed Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Armed Timeout</em>' attribute.
     * @see #isSetArmedTimeout()
     * @see #unsetArmedTimeout()
     * @see #getArmedTimeout()
     * @generated
     */
    void setArmedTimeout( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo#getArmedTimeout <em>Armed Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetArmedTimeout()
     * @see #getArmedTimeout()
     * @see #setArmedTimeout(Float)
     * @generated
     */
    void unsetArmedTimeout();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo#getArmedTimeout <em>Armed Timeout</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Armed Timeout</em>' attribute is set.
     * @see #unsetArmedTimeout()
     * @see #getArmedTimeout()
     * @see #setArmedTimeout(Float)
     * @generated
     */
    boolean isSetArmedTimeout();

    /**
     * Returns the value of the '<em><b>Customer Voltage Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Customer Voltage Limit</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Customer Voltage Limit</em>' attribute.
     * @see #isSetCustomerVoltageLimit()
     * @see #unsetCustomerVoltageLimit()
     * @see #setCustomerVoltageLimit(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRemoteConnectDisconnectInfo_CustomerVoltageLimit()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RemoteConnectDisconnectInfo.customerVoltageLimit' kind='element'"
     * @generated
     */
    Float getCustomerVoltageLimit();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo#getCustomerVoltageLimit <em>Customer Voltage Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Customer Voltage Limit</em>' attribute.
     * @see #isSetCustomerVoltageLimit()
     * @see #unsetCustomerVoltageLimit()
     * @see #getCustomerVoltageLimit()
     * @generated
     */
    void setCustomerVoltageLimit( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo#getCustomerVoltageLimit <em>Customer Voltage Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCustomerVoltageLimit()
     * @see #getCustomerVoltageLimit()
     * @see #setCustomerVoltageLimit(Float)
     * @generated
     */
    void unsetCustomerVoltageLimit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo#getCustomerVoltageLimit <em>Customer Voltage Limit</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Customer Voltage Limit</em>' attribute is set.
     * @see #unsetCustomerVoltageLimit()
     * @see #getCustomerVoltageLimit()
     * @see #setCustomerVoltageLimit(Float)
     * @generated
     */
    boolean isSetCustomerVoltageLimit();

    /**
     * Returns the value of the '<em><b>Energy Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Energy Limit</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Energy Limit</em>' attribute.
     * @see #isSetEnergyLimit()
     * @see #unsetEnergyLimit()
     * @see #setEnergyLimit(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRemoteConnectDisconnectInfo_EnergyLimit()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RemoteConnectDisconnectInfo.energyLimit' kind='element'"
     * @generated
     */
    Float getEnergyLimit();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo#getEnergyLimit <em>Energy Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Energy Limit</em>' attribute.
     * @see #isSetEnergyLimit()
     * @see #unsetEnergyLimit()
     * @see #getEnergyLimit()
     * @generated
     */
    void setEnergyLimit( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo#getEnergyLimit <em>Energy Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEnergyLimit()
     * @see #getEnergyLimit()
     * @see #setEnergyLimit(Float)
     * @generated
     */
    void unsetEnergyLimit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo#getEnergyLimit <em>Energy Limit</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Energy Limit</em>' attribute is set.
     * @see #unsetEnergyLimit()
     * @see #getEnergyLimit()
     * @see #setEnergyLimit(Float)
     * @generated
     */
    boolean isSetEnergyLimit();

    /**
     * Returns the value of the '<em><b>Energy Usage Start Date Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Energy Usage Start Date Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Energy Usage Start Date Time</em>' attribute.
     * @see #isSetEnergyUsageStartDateTime()
     * @see #unsetEnergyUsageStartDateTime()
     * @see #setEnergyUsageStartDateTime(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRemoteConnectDisconnectInfo_EnergyUsageStartDateTime()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RemoteConnectDisconnectInfo.energyUsageStartDateTime' kind='element'"
     * @generated
     */
    Date getEnergyUsageStartDateTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo#getEnergyUsageStartDateTime <em>Energy Usage Start Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Energy Usage Start Date Time</em>' attribute.
     * @see #isSetEnergyUsageStartDateTime()
     * @see #unsetEnergyUsageStartDateTime()
     * @see #getEnergyUsageStartDateTime()
     * @generated
     */
    void setEnergyUsageStartDateTime( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo#getEnergyUsageStartDateTime <em>Energy Usage Start Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEnergyUsageStartDateTime()
     * @see #getEnergyUsageStartDateTime()
     * @see #setEnergyUsageStartDateTime(Date)
     * @generated
     */
    void unsetEnergyUsageStartDateTime();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo#getEnergyUsageStartDateTime <em>Energy Usage Start Date Time</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Energy Usage Start Date Time</em>' attribute is set.
     * @see #unsetEnergyUsageStartDateTime()
     * @see #getEnergyUsageStartDateTime()
     * @see #setEnergyUsageStartDateTime(Date)
     * @generated
     */
    boolean isSetEnergyUsageStartDateTime();

    /**
     * Returns the value of the '<em><b>Energy Usage Warning</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Energy Usage Warning</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Energy Usage Warning</em>' attribute.
     * @see #isSetEnergyUsageWarning()
     * @see #unsetEnergyUsageWarning()
     * @see #setEnergyUsageWarning(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRemoteConnectDisconnectInfo_EnergyUsageWarning()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RemoteConnectDisconnectInfo.energyUsageWarning' kind='element'"
     * @generated
     */
    Float getEnergyUsageWarning();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo#getEnergyUsageWarning <em>Energy Usage Warning</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Energy Usage Warning</em>' attribute.
     * @see #isSetEnergyUsageWarning()
     * @see #unsetEnergyUsageWarning()
     * @see #getEnergyUsageWarning()
     * @generated
     */
    void setEnergyUsageWarning( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo#getEnergyUsageWarning <em>Energy Usage Warning</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEnergyUsageWarning()
     * @see #getEnergyUsageWarning()
     * @see #setEnergyUsageWarning(Float)
     * @generated
     */
    void unsetEnergyUsageWarning();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo#getEnergyUsageWarning <em>Energy Usage Warning</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Energy Usage Warning</em>' attribute is set.
     * @see #unsetEnergyUsageWarning()
     * @see #getEnergyUsageWarning()
     * @see #setEnergyUsageWarning(Float)
     * @generated
     */
    boolean isSetEnergyUsageWarning();

    /**
     * Returns the value of the '<em><b>Is Arm Connect</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Arm Connect</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Arm Connect</em>' attribute.
     * @see #isSetIsArmConnect()
     * @see #unsetIsArmConnect()
     * @see #setIsArmConnect(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRemoteConnectDisconnectInfo_IsArmConnect()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RemoteConnectDisconnectInfo.isArmConnect' kind='element'"
     * @generated
     */
    Boolean getIsArmConnect();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo#getIsArmConnect <em>Is Arm Connect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Arm Connect</em>' attribute.
     * @see #isSetIsArmConnect()
     * @see #unsetIsArmConnect()
     * @see #getIsArmConnect()
     * @generated
     */
    void setIsArmConnect( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo#getIsArmConnect <em>Is Arm Connect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsArmConnect()
     * @see #getIsArmConnect()
     * @see #setIsArmConnect(Boolean)
     * @generated
     */
    void unsetIsArmConnect();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo#getIsArmConnect <em>Is Arm Connect</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Arm Connect</em>' attribute is set.
     * @see #unsetIsArmConnect()
     * @see #getIsArmConnect()
     * @see #setIsArmConnect(Boolean)
     * @generated
     */
    boolean isSetIsArmConnect();

    /**
     * Returns the value of the '<em><b>Is Arm Disconnect</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Arm Disconnect</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Arm Disconnect</em>' attribute.
     * @see #isSetIsArmDisconnect()
     * @see #unsetIsArmDisconnect()
     * @see #setIsArmDisconnect(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRemoteConnectDisconnectInfo_IsArmDisconnect()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RemoteConnectDisconnectInfo.isArmDisconnect' kind='element'"
     * @generated
     */
    Boolean getIsArmDisconnect();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo#getIsArmDisconnect <em>Is Arm Disconnect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Arm Disconnect</em>' attribute.
     * @see #isSetIsArmDisconnect()
     * @see #unsetIsArmDisconnect()
     * @see #getIsArmDisconnect()
     * @generated
     */
    void setIsArmDisconnect( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo#getIsArmDisconnect <em>Is Arm Disconnect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsArmDisconnect()
     * @see #getIsArmDisconnect()
     * @see #setIsArmDisconnect(Boolean)
     * @generated
     */
    void unsetIsArmDisconnect();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo#getIsArmDisconnect <em>Is Arm Disconnect</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Arm Disconnect</em>' attribute is set.
     * @see #unsetIsArmDisconnect()
     * @see #getIsArmDisconnect()
     * @see #setIsArmDisconnect(Boolean)
     * @generated
     */
    boolean isSetIsArmDisconnect();

    /**
     * Returns the value of the '<em><b>Is Energy Limiting</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Energy Limiting</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Energy Limiting</em>' attribute.
     * @see #isSetIsEnergyLimiting()
     * @see #unsetIsEnergyLimiting()
     * @see #setIsEnergyLimiting(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRemoteConnectDisconnectInfo_IsEnergyLimiting()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RemoteConnectDisconnectInfo.isEnergyLimiting' kind='element'"
     * @generated
     */
    Boolean getIsEnergyLimiting();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo#getIsEnergyLimiting <em>Is Energy Limiting</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Energy Limiting</em>' attribute.
     * @see #isSetIsEnergyLimiting()
     * @see #unsetIsEnergyLimiting()
     * @see #getIsEnergyLimiting()
     * @generated
     */
    void setIsEnergyLimiting( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo#getIsEnergyLimiting <em>Is Energy Limiting</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsEnergyLimiting()
     * @see #getIsEnergyLimiting()
     * @see #setIsEnergyLimiting(Boolean)
     * @generated
     */
    void unsetIsEnergyLimiting();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo#getIsEnergyLimiting <em>Is Energy Limiting</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Energy Limiting</em>' attribute is set.
     * @see #unsetIsEnergyLimiting()
     * @see #getIsEnergyLimiting()
     * @see #setIsEnergyLimiting(Boolean)
     * @generated
     */
    boolean isSetIsEnergyLimiting();

    /**
     * Returns the value of the '<em><b>Needs Power Limit Check</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Needs Power Limit Check</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Needs Power Limit Check</em>' attribute.
     * @see #isSetNeedsPowerLimitCheck()
     * @see #unsetNeedsPowerLimitCheck()
     * @see #setNeedsPowerLimitCheck(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRemoteConnectDisconnectInfo_NeedsPowerLimitCheck()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RemoteConnectDisconnectInfo.needsPowerLimitCheck' kind='element'"
     * @generated
     */
    Boolean getNeedsPowerLimitCheck();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo#getNeedsPowerLimitCheck <em>Needs Power Limit Check</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Needs Power Limit Check</em>' attribute.
     * @see #isSetNeedsPowerLimitCheck()
     * @see #unsetNeedsPowerLimitCheck()
     * @see #getNeedsPowerLimitCheck()
     * @generated
     */
    void setNeedsPowerLimitCheck( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo#getNeedsPowerLimitCheck <em>Needs Power Limit Check</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNeedsPowerLimitCheck()
     * @see #getNeedsPowerLimitCheck()
     * @see #setNeedsPowerLimitCheck(Boolean)
     * @generated
     */
    void unsetNeedsPowerLimitCheck();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo#getNeedsPowerLimitCheck <em>Needs Power Limit Check</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Needs Power Limit Check</em>' attribute is set.
     * @see #unsetNeedsPowerLimitCheck()
     * @see #getNeedsPowerLimitCheck()
     * @see #setNeedsPowerLimitCheck(Boolean)
     * @generated
     */
    boolean isSetNeedsPowerLimitCheck();

    /**
     * Returns the value of the '<em><b>Needs Voltage Limit Check</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Needs Voltage Limit Check</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Needs Voltage Limit Check</em>' attribute.
     * @see #isSetNeedsVoltageLimitCheck()
     * @see #unsetNeedsVoltageLimitCheck()
     * @see #setNeedsVoltageLimitCheck(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRemoteConnectDisconnectInfo_NeedsVoltageLimitCheck()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RemoteConnectDisconnectInfo.needsVoltageLimitCheck' kind='element'"
     * @generated
     */
    Boolean getNeedsVoltageLimitCheck();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo#getNeedsVoltageLimitCheck <em>Needs Voltage Limit Check</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Needs Voltage Limit Check</em>' attribute.
     * @see #isSetNeedsVoltageLimitCheck()
     * @see #unsetNeedsVoltageLimitCheck()
     * @see #getNeedsVoltageLimitCheck()
     * @generated
     */
    void setNeedsVoltageLimitCheck( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo#getNeedsVoltageLimitCheck <em>Needs Voltage Limit Check</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNeedsVoltageLimitCheck()
     * @see #getNeedsVoltageLimitCheck()
     * @see #setNeedsVoltageLimitCheck(Boolean)
     * @generated
     */
    void unsetNeedsVoltageLimitCheck();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo#getNeedsVoltageLimitCheck <em>Needs Voltage Limit Check</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Needs Voltage Limit Check</em>' attribute is set.
     * @see #unsetNeedsVoltageLimitCheck()
     * @see #getNeedsVoltageLimitCheck()
     * @see #setNeedsVoltageLimitCheck(Boolean)
     * @generated
     */
    boolean isSetNeedsVoltageLimitCheck();

    /**
     * Returns the value of the '<em><b>Power Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Power Limit</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Power Limit</em>' attribute.
     * @see #isSetPowerLimit()
     * @see #unsetPowerLimit()
     * @see #setPowerLimit(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRemoteConnectDisconnectInfo_PowerLimit()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RemoteConnectDisconnectInfo.powerLimit' kind='element'"
     * @generated
     */
    Float getPowerLimit();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo#getPowerLimit <em>Power Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Power Limit</em>' attribute.
     * @see #isSetPowerLimit()
     * @see #unsetPowerLimit()
     * @see #getPowerLimit()
     * @generated
     */
    void setPowerLimit( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo#getPowerLimit <em>Power Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPowerLimit()
     * @see #getPowerLimit()
     * @see #setPowerLimit(Float)
     * @generated
     */
    void unsetPowerLimit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo#getPowerLimit <em>Power Limit</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Power Limit</em>' attribute is set.
     * @see #unsetPowerLimit()
     * @see #getPowerLimit()
     * @see #setPowerLimit(Float)
     * @generated
     */
    boolean isSetPowerLimit();

    /**
     * Returns the value of the '<em><b>Use Pushbutton</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Use Pushbutton</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Use Pushbutton</em>' attribute.
     * @see #isSetUsePushbutton()
     * @see #unsetUsePushbutton()
     * @see #setUsePushbutton(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRemoteConnectDisconnectInfo_UsePushbutton()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RemoteConnectDisconnectInfo.usePushbutton' kind='element'"
     * @generated
     */
    Boolean getUsePushbutton();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo#getUsePushbutton <em>Use Pushbutton</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Use Pushbutton</em>' attribute.
     * @see #isSetUsePushbutton()
     * @see #unsetUsePushbutton()
     * @see #getUsePushbutton()
     * @generated
     */
    void setUsePushbutton( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo#getUsePushbutton <em>Use Pushbutton</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUsePushbutton()
     * @see #getUsePushbutton()
     * @see #setUsePushbutton(Boolean)
     * @generated
     */
    void unsetUsePushbutton();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteConnectDisconnectInfo#getUsePushbutton <em>Use Pushbutton</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Use Pushbutton</em>' attribute is set.
     * @see #unsetUsePushbutton()
     * @see #getUsePushbutton()
     * @see #setUsePushbutton(Boolean)
     * @generated
     */
    boolean isSetUsePushbutton();

} // RemoteConnectDisconnectInfo
