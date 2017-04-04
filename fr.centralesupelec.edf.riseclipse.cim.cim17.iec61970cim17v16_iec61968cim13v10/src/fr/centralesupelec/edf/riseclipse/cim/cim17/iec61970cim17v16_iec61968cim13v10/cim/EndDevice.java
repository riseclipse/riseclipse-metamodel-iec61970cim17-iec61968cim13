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
 * A representation of the model object '<em><b>End Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getAmrSystem <em>Amr System</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getInstallCode <em>Install Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getIsPan <em>Is Pan</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getIsSmartInverter <em>Is Smart Inverter</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getIsVirtual <em>Is Virtual</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getTimeZoneOffset <em>Time Zone Offset</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getEndDeviceInfo <em>End Device Info</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getEndDeviceGroups <em>End Device Groups</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getEndDeviceFunctions <em>End Device Functions</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getOtherCapability <em>Other Capability</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getCustomer <em>Customer</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getUsagePoint <em>Usage Point</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getEndDeviceEvents <em>End Device Events</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getEndDeviceControls <em>End Device Controls</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getDispatchablePowerCapability <em>Dispatchable Power Capability</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getServiceLocation <em>Service Location</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDevice()
 * @model
 * @generated
 */
public interface EndDevice extends AssetContainer {
    /**
     * Returns the value of the '<em><b>Amr System</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Amr System</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Amr System</em>' attribute.
     * @see #isSetAmrSystem()
     * @see #unsetAmrSystem()
     * @see #setAmrSystem(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDevice_AmrSystem()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDevice.amrSystem' kind='element'"
     * @generated
     */
    String getAmrSystem();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getAmrSystem <em>Amr System</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Amr System</em>' attribute.
     * @see #isSetAmrSystem()
     * @see #unsetAmrSystem()
     * @see #getAmrSystem()
     * @generated
     */
    void setAmrSystem( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getAmrSystem <em>Amr System</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAmrSystem()
     * @see #getAmrSystem()
     * @see #setAmrSystem(String)
     * @generated
     */
    void unsetAmrSystem();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getAmrSystem <em>Amr System</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Amr System</em>' attribute is set.
     * @see #unsetAmrSystem()
     * @see #getAmrSystem()
     * @see #setAmrSystem(String)
     * @generated
     */
    boolean isSetAmrSystem();

    /**
     * Returns the value of the '<em><b>Install Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Install Code</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Install Code</em>' attribute.
     * @see #isSetInstallCode()
     * @see #unsetInstallCode()
     * @see #setInstallCode(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDevice_InstallCode()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDevice.installCode' kind='element'"
     * @generated
     */
    String getInstallCode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getInstallCode <em>Install Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Install Code</em>' attribute.
     * @see #isSetInstallCode()
     * @see #unsetInstallCode()
     * @see #getInstallCode()
     * @generated
     */
    void setInstallCode( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getInstallCode <em>Install Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInstallCode()
     * @see #getInstallCode()
     * @see #setInstallCode(String)
     * @generated
     */
    void unsetInstallCode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getInstallCode <em>Install Code</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Install Code</em>' attribute is set.
     * @see #unsetInstallCode()
     * @see #getInstallCode()
     * @see #setInstallCode(String)
     * @generated
     */
    boolean isSetInstallCode();

    /**
     * Returns the value of the '<em><b>Is Pan</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Pan</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Pan</em>' attribute.
     * @see #isSetIsPan()
     * @see #unsetIsPan()
     * @see #setIsPan(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDevice_IsPan()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDevice.isPan' kind='element'"
     * @generated
     */
    Boolean getIsPan();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getIsPan <em>Is Pan</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Pan</em>' attribute.
     * @see #isSetIsPan()
     * @see #unsetIsPan()
     * @see #getIsPan()
     * @generated
     */
    void setIsPan( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getIsPan <em>Is Pan</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsPan()
     * @see #getIsPan()
     * @see #setIsPan(Boolean)
     * @generated
     */
    void unsetIsPan();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getIsPan <em>Is Pan</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Pan</em>' attribute is set.
     * @see #unsetIsPan()
     * @see #getIsPan()
     * @see #setIsPan(Boolean)
     * @generated
     */
    boolean isSetIsPan();

    /**
     * Returns the value of the '<em><b>Is Smart Inverter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Smart Inverter</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Smart Inverter</em>' attribute.
     * @see #isSetIsSmartInverter()
     * @see #unsetIsSmartInverter()
     * @see #setIsSmartInverter(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDevice_IsSmartInverter()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDevice.isSmartInverter' kind='element'"
     * @generated
     */
    Boolean getIsSmartInverter();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getIsSmartInverter <em>Is Smart Inverter</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Smart Inverter</em>' attribute.
     * @see #isSetIsSmartInverter()
     * @see #unsetIsSmartInverter()
     * @see #getIsSmartInverter()
     * @generated
     */
    void setIsSmartInverter( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getIsSmartInverter <em>Is Smart Inverter</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsSmartInverter()
     * @see #getIsSmartInverter()
     * @see #setIsSmartInverter(Boolean)
     * @generated
     */
    void unsetIsSmartInverter();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getIsSmartInverter <em>Is Smart Inverter</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Smart Inverter</em>' attribute is set.
     * @see #unsetIsSmartInverter()
     * @see #getIsSmartInverter()
     * @see #setIsSmartInverter(Boolean)
     * @generated
     */
    boolean isSetIsSmartInverter();

    /**
     * Returns the value of the '<em><b>Is Virtual</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Virtual</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Virtual</em>' attribute.
     * @see #isSetIsVirtual()
     * @see #unsetIsVirtual()
     * @see #setIsVirtual(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDevice_IsVirtual()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDevice.isVirtual' kind='element'"
     * @generated
     */
    Boolean getIsVirtual();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getIsVirtual <em>Is Virtual</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Virtual</em>' attribute.
     * @see #isSetIsVirtual()
     * @see #unsetIsVirtual()
     * @see #getIsVirtual()
     * @generated
     */
    void setIsVirtual( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getIsVirtual <em>Is Virtual</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsVirtual()
     * @see #getIsVirtual()
     * @see #setIsVirtual(Boolean)
     * @generated
     */
    void unsetIsVirtual();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getIsVirtual <em>Is Virtual</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Virtual</em>' attribute is set.
     * @see #unsetIsVirtual()
     * @see #getIsVirtual()
     * @see #setIsVirtual(Boolean)
     * @generated
     */
    boolean isSetIsVirtual();

    /**
     * Returns the value of the '<em><b>Time Zone Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Time Zone Offset</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Time Zone Offset</em>' attribute.
     * @see #isSetTimeZoneOffset()
     * @see #unsetTimeZoneOffset()
     * @see #setTimeZoneOffset(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDevice_TimeZoneOffset()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDevice.timeZoneOffset' kind='element'"
     * @generated
     */
    Float getTimeZoneOffset();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getTimeZoneOffset <em>Time Zone Offset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Time Zone Offset</em>' attribute.
     * @see #isSetTimeZoneOffset()
     * @see #unsetTimeZoneOffset()
     * @see #getTimeZoneOffset()
     * @generated
     */
    void setTimeZoneOffset( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getTimeZoneOffset <em>Time Zone Offset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTimeZoneOffset()
     * @see #getTimeZoneOffset()
     * @see #setTimeZoneOffset(Float)
     * @generated
     */
    void unsetTimeZoneOffset();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getTimeZoneOffset <em>Time Zone Offset</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Time Zone Offset</em>' attribute is set.
     * @see #unsetTimeZoneOffset()
     * @see #getTimeZoneOffset()
     * @see #setTimeZoneOffset(Float)
     * @generated
     */
    boolean isSetTimeZoneOffset();

    /**
     * Returns the value of the '<em><b>End Device Info</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceInfo#getEndDevices <em>End Devices</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>End Device Info</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>End Device Info</em>' reference.
     * @see #isSetEndDeviceInfo()
     * @see #unsetEndDeviceInfo()
     * @see #setEndDeviceInfo(EndDeviceInfo)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDevice_EndDeviceInfo()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceInfo#getEndDevices
     * @model opposite="EndDevices" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDevice.EndDeviceInfo' kind='element'"
     * @generated
     */
    EndDeviceInfo getEndDeviceInfo();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getEndDeviceInfo <em>End Device Info</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>End Device Info</em>' reference.
     * @see #isSetEndDeviceInfo()
     * @see #unsetEndDeviceInfo()
     * @see #getEndDeviceInfo()
     * @generated
     */
    void setEndDeviceInfo( EndDeviceInfo value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getEndDeviceInfo <em>End Device Info</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEndDeviceInfo()
     * @see #getEndDeviceInfo()
     * @see #setEndDeviceInfo(EndDeviceInfo)
     * @generated
     */
    void unsetEndDeviceInfo();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getEndDeviceInfo <em>End Device Info</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>End Device Info</em>' reference is set.
     * @see #unsetEndDeviceInfo()
     * @see #getEndDeviceInfo()
     * @see #setEndDeviceInfo(EndDeviceInfo)
     * @generated
     */
    boolean isSetEndDeviceInfo();

    /**
     * Returns the value of the '<em><b>End Device Groups</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceGroup}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceGroup#getEndDevices <em>End Devices</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>End Device Groups</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>End Device Groups</em>' reference list.
     * @see #isSetEndDeviceGroups()
     * @see #unsetEndDeviceGroups()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDevice_EndDeviceGroups()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceGroup#getEndDevices
     * @model opposite="EndDevices" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDevice.EndDeviceGroups' kind='element'"
     * @generated
     */
    EList< EndDeviceGroup > getEndDeviceGroups();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getEndDeviceGroups <em>End Device Groups</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEndDeviceGroups()
     * @see #getEndDeviceGroups()
     * @generated
     */
    void unsetEndDeviceGroups();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getEndDeviceGroups <em>End Device Groups</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>End Device Groups</em>' reference list is set.
     * @see #unsetEndDeviceGroups()
     * @see #getEndDeviceGroups()
     * @generated
     */
    boolean isSetEndDeviceGroups();

    /**
     * Returns the value of the '<em><b>End Device Functions</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceFunction}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceFunction#getEndDevice <em>End Device</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>End Device Functions</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>End Device Functions</em>' reference list.
     * @see #isSetEndDeviceFunctions()
     * @see #unsetEndDeviceFunctions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDevice_EndDeviceFunctions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceFunction#getEndDevice
     * @model opposite="EndDevice" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDevice.EndDeviceFunctions' kind='element'"
     * @generated
     */
    EList< EndDeviceFunction > getEndDeviceFunctions();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getEndDeviceFunctions <em>End Device Functions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEndDeviceFunctions()
     * @see #getEndDeviceFunctions()
     * @generated
     */
    void unsetEndDeviceFunctions();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getEndDeviceFunctions <em>End Device Functions</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>End Device Functions</em>' reference list is set.
     * @see #unsetEndDeviceFunctions()
     * @see #getEndDeviceFunctions()
     * @generated
     */
    boolean isSetEndDeviceFunctions();

    /**
     * Returns the value of the '<em><b>Other Capability</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OtherCapability}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OtherCapability#getEndDevice <em>End Device</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Other Capability</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Other Capability</em>' reference list.
     * @see #isSetOtherCapability()
     * @see #unsetOtherCapability()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDevice_OtherCapability()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OtherCapability#getEndDevice
     * @model opposite="EndDevice" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDevice.OtherCapability' kind='element'"
     * @generated
     */
    EList< OtherCapability > getOtherCapability();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getOtherCapability <em>Other Capability</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOtherCapability()
     * @see #getOtherCapability()
     * @generated
     */
    void unsetOtherCapability();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getOtherCapability <em>Other Capability</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Other Capability</em>' reference list is set.
     * @see #unsetOtherCapability()
     * @see #getOtherCapability()
     * @generated
     */
    boolean isSetOtherCapability();

    /**
     * Returns the value of the '<em><b>Customer</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getEndDevices <em>End Devices</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Customer</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Customer</em>' reference.
     * @see #isSetCustomer()
     * @see #unsetCustomer()
     * @see #setCustomer(Customer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDevice_Customer()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getEndDevices
     * @model opposite="EndDevices" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDevice.Customer' kind='element'"
     * @generated
     */
    Customer getCustomer();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getCustomer <em>Customer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Customer</em>' reference.
     * @see #isSetCustomer()
     * @see #unsetCustomer()
     * @see #getCustomer()
     * @generated
     */
    void setCustomer( Customer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getCustomer <em>Customer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCustomer()
     * @see #getCustomer()
     * @see #setCustomer(Customer)
     * @generated
     */
    void unsetCustomer();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getCustomer <em>Customer</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Customer</em>' reference is set.
     * @see #unsetCustomer()
     * @see #getCustomer()
     * @see #setCustomer(Customer)
     * @generated
     */
    boolean isSetCustomer();

    /**
     * Returns the value of the '<em><b>Usage Point</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UsagePoint#getEndDevices <em>End Devices</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Usage Point</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Usage Point</em>' reference.
     * @see #isSetUsagePoint()
     * @see #unsetUsagePoint()
     * @see #setUsagePoint(UsagePoint)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDevice_UsagePoint()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UsagePoint#getEndDevices
     * @model opposite="EndDevices" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDevice.UsagePoint' kind='element'"
     * @generated
     */
    UsagePoint getUsagePoint();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getUsagePoint <em>Usage Point</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Usage Point</em>' reference.
     * @see #isSetUsagePoint()
     * @see #unsetUsagePoint()
     * @see #getUsagePoint()
     * @generated
     */
    void setUsagePoint( UsagePoint value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getUsagePoint <em>Usage Point</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUsagePoint()
     * @see #getUsagePoint()
     * @see #setUsagePoint(UsagePoint)
     * @generated
     */
    void unsetUsagePoint();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getUsagePoint <em>Usage Point</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Usage Point</em>' reference is set.
     * @see #unsetUsagePoint()
     * @see #getUsagePoint()
     * @see #setUsagePoint(UsagePoint)
     * @generated
     */
    boolean isSetUsagePoint();

    /**
     * Returns the value of the '<em><b>End Device Events</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceEvent}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceEvent#getEndDevice <em>End Device</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>End Device Events</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>End Device Events</em>' reference list.
     * @see #isSetEndDeviceEvents()
     * @see #unsetEndDeviceEvents()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDevice_EndDeviceEvents()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceEvent#getEndDevice
     * @model opposite="EndDevice" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDevice.EndDeviceEvents' kind='element'"
     * @generated
     */
    EList< EndDeviceEvent > getEndDeviceEvents();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getEndDeviceEvents <em>End Device Events</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEndDeviceEvents()
     * @see #getEndDeviceEvents()
     * @generated
     */
    void unsetEndDeviceEvents();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getEndDeviceEvents <em>End Device Events</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>End Device Events</em>' reference list is set.
     * @see #unsetEndDeviceEvents()
     * @see #getEndDeviceEvents()
     * @generated
     */
    boolean isSetEndDeviceEvents();

    /**
     * Returns the value of the '<em><b>End Device Controls</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getEndDevices <em>End Devices</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>End Device Controls</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>End Device Controls</em>' reference list.
     * @see #isSetEndDeviceControls()
     * @see #unsetEndDeviceControls()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDevice_EndDeviceControls()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceControl#getEndDevices
     * @model opposite="EndDevices" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDevice.EndDeviceControls' kind='element'"
     * @generated
     */
    EList< EndDeviceControl > getEndDeviceControls();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getEndDeviceControls <em>End Device Controls</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEndDeviceControls()
     * @see #getEndDeviceControls()
     * @generated
     */
    void unsetEndDeviceControls();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getEndDeviceControls <em>End Device Controls</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>End Device Controls</em>' reference list is set.
     * @see #unsetEndDeviceControls()
     * @see #getEndDeviceControls()
     * @generated
     */
    boolean isSetEndDeviceControls();

    /**
     * Returns the value of the '<em><b>Dispatchable Power Capability</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability#getEndDevice <em>End Device</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dispatchable Power Capability</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dispatchable Power Capability</em>' reference list.
     * @see #isSetDispatchablePowerCapability()
     * @see #unsetDispatchablePowerCapability()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDevice_DispatchablePowerCapability()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability#getEndDevice
     * @model opposite="EndDevice" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDevice.DispatchablePowerCapability' kind='element'"
     * @generated
     */
    EList< DispatchablePowerCapability > getDispatchablePowerCapability();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getDispatchablePowerCapability <em>Dispatchable Power Capability</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDispatchablePowerCapability()
     * @see #getDispatchablePowerCapability()
     * @generated
     */
    void unsetDispatchablePowerCapability();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getDispatchablePowerCapability <em>Dispatchable Power Capability</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dispatchable Power Capability</em>' reference list is set.
     * @see #unsetDispatchablePowerCapability()
     * @see #getDispatchablePowerCapability()
     * @generated
     */
    boolean isSetDispatchablePowerCapability();

    /**
     * Returns the value of the '<em><b>Service Location</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ServiceLocation#getEndDevices <em>End Devices</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Service Location</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Service Location</em>' reference.
     * @see #isSetServiceLocation()
     * @see #unsetServiceLocation()
     * @see #setServiceLocation(ServiceLocation)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEndDevice_ServiceLocation()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ServiceLocation#getEndDevices
     * @model opposite="EndDevices" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EndDevice.ServiceLocation' kind='element'"
     * @generated
     */
    ServiceLocation getServiceLocation();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getServiceLocation <em>Service Location</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Service Location</em>' reference.
     * @see #isSetServiceLocation()
     * @see #unsetServiceLocation()
     * @see #getServiceLocation()
     * @generated
     */
    void setServiceLocation( ServiceLocation value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getServiceLocation <em>Service Location</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetServiceLocation()
     * @see #getServiceLocation()
     * @see #setServiceLocation(ServiceLocation)
     * @generated
     */
    void unsetServiceLocation();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getServiceLocation <em>Service Location</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Service Location</em>' reference is set.
     * @see #unsetServiceLocation()
     * @see #getServiceLocation()
     * @see #setServiceLocation(ServiceLocation)
     * @generated
     */
    boolean isSetServiceLocation();

} // EndDevice
