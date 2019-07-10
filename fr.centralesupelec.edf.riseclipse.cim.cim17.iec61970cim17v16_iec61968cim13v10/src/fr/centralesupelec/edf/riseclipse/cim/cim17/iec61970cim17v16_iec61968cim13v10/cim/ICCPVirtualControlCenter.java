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
 * A representation of the model object '<em><b>ICCP Virtual Control Center</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPVirtualControlCenter#getCalling <em>Calling</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPVirtualControlCenter#getClientAndServer <em>Client And Server</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPVirtualControlCenter#getMinimumUpdateInterval <em>Minimum Update Interval</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPVirtualControlCenter#getNameOfLocalICC <em>Name Of Local ICC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPVirtualControlCenter#getSupportForBlock1 <em>Support For Block1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPVirtualControlCenter#getSupportForBlock2 <em>Support For Block2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPVirtualControlCenter#getSupportForBlock3 <em>Support For Block3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPVirtualControlCenter#getSupportForBlock4 <em>Support For Block4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPVirtualControlCenter#getSupportForBlock5 <em>Support For Block5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPVirtualControlCenter#getSupportForDepriciatedBlock8 <em>Support For Depriciated Block8</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPVirtualControlCenter#getTransportSecurityRequirement <em>Transport Security Requirement</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getICCPVirtualControlCenter()
 * @model
 * @generated
 */
public interface ICCPVirtualControlCenter extends BilateralExchangeActor {
    /**
     * Returns the value of the '<em><b>Calling</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Calling</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Calling</em>' attribute.
     * @see #isSetCalling()
     * @see #unsetCalling()
     * @see #setCalling(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getICCPVirtualControlCenter_Calling()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ICCPVirtualControlCenter.calling' kind='element'"
     * @generated
     */
    Boolean getCalling();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPVirtualControlCenter#getCalling <em>Calling</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Calling</em>' attribute.
     * @see #isSetCalling()
     * @see #unsetCalling()
     * @see #getCalling()
     * @generated
     */
    void setCalling( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPVirtualControlCenter#getCalling <em>Calling</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCalling()
     * @see #getCalling()
     * @see #setCalling(Boolean)
     * @generated
     */
    void unsetCalling();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPVirtualControlCenter#getCalling <em>Calling</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Calling</em>' attribute is set.
     * @see #unsetCalling()
     * @see #getCalling()
     * @see #setCalling(Boolean)
     * @generated
     */
    boolean isSetCalling();

    /**
     * Returns the value of the '<em><b>Client And Server</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Client And Server</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Client And Server</em>' attribute.
     * @see #isSetClientAndServer()
     * @see #unsetClientAndServer()
     * @see #setClientAndServer(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getICCPVirtualControlCenter_ClientAndServer()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ICCPVirtualControlCenter.clientAndServer' kind='element'"
     * @generated
     */
    Boolean getClientAndServer();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPVirtualControlCenter#getClientAndServer <em>Client And Server</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Client And Server</em>' attribute.
     * @see #isSetClientAndServer()
     * @see #unsetClientAndServer()
     * @see #getClientAndServer()
     * @generated
     */
    void setClientAndServer( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPVirtualControlCenter#getClientAndServer <em>Client And Server</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetClientAndServer()
     * @see #getClientAndServer()
     * @see #setClientAndServer(Boolean)
     * @generated
     */
    void unsetClientAndServer();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPVirtualControlCenter#getClientAndServer <em>Client And Server</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Client And Server</em>' attribute is set.
     * @see #unsetClientAndServer()
     * @see #getClientAndServer()
     * @see #setClientAndServer(Boolean)
     * @generated
     */
    boolean isSetClientAndServer();

    /**
     * Returns the value of the '<em><b>Minimum Update Interval</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Minimum Update Interval</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Minimum Update Interval</em>' attribute.
     * @see #isSetMinimumUpdateInterval()
     * @see #unsetMinimumUpdateInterval()
     * @see #setMinimumUpdateInterval(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getICCPVirtualControlCenter_MinimumUpdateInterval()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ICCPVirtualControlCenter.minimumUpdateInterval' kind='element'"
     * @generated
     */
    Integer getMinimumUpdateInterval();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPVirtualControlCenter#getMinimumUpdateInterval <em>Minimum Update Interval</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Minimum Update Interval</em>' attribute.
     * @see #isSetMinimumUpdateInterval()
     * @see #unsetMinimumUpdateInterval()
     * @see #getMinimumUpdateInterval()
     * @generated
     */
    void setMinimumUpdateInterval( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPVirtualControlCenter#getMinimumUpdateInterval <em>Minimum Update Interval</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinimumUpdateInterval()
     * @see #getMinimumUpdateInterval()
     * @see #setMinimumUpdateInterval(Integer)
     * @generated
     */
    void unsetMinimumUpdateInterval();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPVirtualControlCenter#getMinimumUpdateInterval <em>Minimum Update Interval</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Minimum Update Interval</em>' attribute is set.
     * @see #unsetMinimumUpdateInterval()
     * @see #getMinimumUpdateInterval()
     * @see #setMinimumUpdateInterval(Integer)
     * @generated
     */
    boolean isSetMinimumUpdateInterval();

    /**
     * Returns the value of the '<em><b>Name Of Local ICC</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name Of Local ICC</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name Of Local ICC</em>' attribute.
     * @see #isSetNameOfLocalICC()
     * @see #unsetNameOfLocalICC()
     * @see #setNameOfLocalICC(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getICCPVirtualControlCenter_NameOfLocalICC()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ICCPVirtualControlCenter.nameOfLocalICC' kind='element'"
     * @generated
     */
    String getNameOfLocalICC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPVirtualControlCenter#getNameOfLocalICC <em>Name Of Local ICC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name Of Local ICC</em>' attribute.
     * @see #isSetNameOfLocalICC()
     * @see #unsetNameOfLocalICC()
     * @see #getNameOfLocalICC()
     * @generated
     */
    void setNameOfLocalICC( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPVirtualControlCenter#getNameOfLocalICC <em>Name Of Local ICC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNameOfLocalICC()
     * @see #getNameOfLocalICC()
     * @see #setNameOfLocalICC(String)
     * @generated
     */
    void unsetNameOfLocalICC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPVirtualControlCenter#getNameOfLocalICC <em>Name Of Local ICC</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Name Of Local ICC</em>' attribute is set.
     * @see #unsetNameOfLocalICC()
     * @see #getNameOfLocalICC()
     * @see #setNameOfLocalICC(String)
     * @generated
     */
    boolean isSetNameOfLocalICC();

    /**
     * Returns the value of the '<em><b>Support For Block1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Support For Block1</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Support For Block1</em>' attribute.
     * @see #isSetSupportForBlock1()
     * @see #unsetSupportForBlock1()
     * @see #setSupportForBlock1(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getICCPVirtualControlCenter_SupportForBlock1()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ICCPVirtualControlCenter.supportForBlock1' kind='element'"
     * @generated
     */
    Boolean getSupportForBlock1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPVirtualControlCenter#getSupportForBlock1 <em>Support For Block1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Support For Block1</em>' attribute.
     * @see #isSetSupportForBlock1()
     * @see #unsetSupportForBlock1()
     * @see #getSupportForBlock1()
     * @generated
     */
    void setSupportForBlock1( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPVirtualControlCenter#getSupportForBlock1 <em>Support For Block1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSupportForBlock1()
     * @see #getSupportForBlock1()
     * @see #setSupportForBlock1(Boolean)
     * @generated
     */
    void unsetSupportForBlock1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPVirtualControlCenter#getSupportForBlock1 <em>Support For Block1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Support For Block1</em>' attribute is set.
     * @see #unsetSupportForBlock1()
     * @see #getSupportForBlock1()
     * @see #setSupportForBlock1(Boolean)
     * @generated
     */
    boolean isSetSupportForBlock1();

    /**
     * Returns the value of the '<em><b>Support For Block2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Support For Block2</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Support For Block2</em>' attribute.
     * @see #isSetSupportForBlock2()
     * @see #unsetSupportForBlock2()
     * @see #setSupportForBlock2(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getICCPVirtualControlCenter_SupportForBlock2()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ICCPVirtualControlCenter.supportForBlock2' kind='element'"
     * @generated
     */
    Boolean getSupportForBlock2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPVirtualControlCenter#getSupportForBlock2 <em>Support For Block2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Support For Block2</em>' attribute.
     * @see #isSetSupportForBlock2()
     * @see #unsetSupportForBlock2()
     * @see #getSupportForBlock2()
     * @generated
     */
    void setSupportForBlock2( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPVirtualControlCenter#getSupportForBlock2 <em>Support For Block2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSupportForBlock2()
     * @see #getSupportForBlock2()
     * @see #setSupportForBlock2(Boolean)
     * @generated
     */
    void unsetSupportForBlock2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPVirtualControlCenter#getSupportForBlock2 <em>Support For Block2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Support For Block2</em>' attribute is set.
     * @see #unsetSupportForBlock2()
     * @see #getSupportForBlock2()
     * @see #setSupportForBlock2(Boolean)
     * @generated
     */
    boolean isSetSupportForBlock2();

    /**
     * Returns the value of the '<em><b>Support For Block3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Support For Block3</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Support For Block3</em>' attribute.
     * @see #isSetSupportForBlock3()
     * @see #unsetSupportForBlock3()
     * @see #setSupportForBlock3(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getICCPVirtualControlCenter_SupportForBlock3()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ICCPVirtualControlCenter.supportForBlock3' kind='element'"
     * @generated
     */
    Boolean getSupportForBlock3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPVirtualControlCenter#getSupportForBlock3 <em>Support For Block3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Support For Block3</em>' attribute.
     * @see #isSetSupportForBlock3()
     * @see #unsetSupportForBlock3()
     * @see #getSupportForBlock3()
     * @generated
     */
    void setSupportForBlock3( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPVirtualControlCenter#getSupportForBlock3 <em>Support For Block3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSupportForBlock3()
     * @see #getSupportForBlock3()
     * @see #setSupportForBlock3(Boolean)
     * @generated
     */
    void unsetSupportForBlock3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPVirtualControlCenter#getSupportForBlock3 <em>Support For Block3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Support For Block3</em>' attribute is set.
     * @see #unsetSupportForBlock3()
     * @see #getSupportForBlock3()
     * @see #setSupportForBlock3(Boolean)
     * @generated
     */
    boolean isSetSupportForBlock3();

    /**
     * Returns the value of the '<em><b>Support For Block4</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Support For Block4</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Support For Block4</em>' attribute.
     * @see #isSetSupportForBlock4()
     * @see #unsetSupportForBlock4()
     * @see #setSupportForBlock4(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getICCPVirtualControlCenter_SupportForBlock4()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ICCPVirtualControlCenter.supportForBlock4' kind='element'"
     * @generated
     */
    Boolean getSupportForBlock4();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPVirtualControlCenter#getSupportForBlock4 <em>Support For Block4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Support For Block4</em>' attribute.
     * @see #isSetSupportForBlock4()
     * @see #unsetSupportForBlock4()
     * @see #getSupportForBlock4()
     * @generated
     */
    void setSupportForBlock4( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPVirtualControlCenter#getSupportForBlock4 <em>Support For Block4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSupportForBlock4()
     * @see #getSupportForBlock4()
     * @see #setSupportForBlock4(Boolean)
     * @generated
     */
    void unsetSupportForBlock4();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPVirtualControlCenter#getSupportForBlock4 <em>Support For Block4</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Support For Block4</em>' attribute is set.
     * @see #unsetSupportForBlock4()
     * @see #getSupportForBlock4()
     * @see #setSupportForBlock4(Boolean)
     * @generated
     */
    boolean isSetSupportForBlock4();

    /**
     * Returns the value of the '<em><b>Support For Block5</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Support For Block5</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Support For Block5</em>' attribute.
     * @see #isSetSupportForBlock5()
     * @see #unsetSupportForBlock5()
     * @see #setSupportForBlock5(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getICCPVirtualControlCenter_SupportForBlock5()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ICCPVirtualControlCenter.supportForBlock5' kind='element'"
     * @generated
     */
    Boolean getSupportForBlock5();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPVirtualControlCenter#getSupportForBlock5 <em>Support For Block5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Support For Block5</em>' attribute.
     * @see #isSetSupportForBlock5()
     * @see #unsetSupportForBlock5()
     * @see #getSupportForBlock5()
     * @generated
     */
    void setSupportForBlock5( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPVirtualControlCenter#getSupportForBlock5 <em>Support For Block5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSupportForBlock5()
     * @see #getSupportForBlock5()
     * @see #setSupportForBlock5(Boolean)
     * @generated
     */
    void unsetSupportForBlock5();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPVirtualControlCenter#getSupportForBlock5 <em>Support For Block5</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Support For Block5</em>' attribute is set.
     * @see #unsetSupportForBlock5()
     * @see #getSupportForBlock5()
     * @see #setSupportForBlock5(Boolean)
     * @generated
     */
    boolean isSetSupportForBlock5();

    /**
     * Returns the value of the '<em><b>Support For Depriciated Block8</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Support For Depriciated Block8</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Support For Depriciated Block8</em>' attribute.
     * @see #isSetSupportForDepriciatedBlock8()
     * @see #unsetSupportForDepriciatedBlock8()
     * @see #setSupportForDepriciatedBlock8(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getICCPVirtualControlCenter_SupportForDepriciatedBlock8()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ICCPVirtualControlCenter.supportForDepriciatedBlock8' kind='element'"
     * @generated
     */
    Boolean getSupportForDepriciatedBlock8();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPVirtualControlCenter#getSupportForDepriciatedBlock8 <em>Support For Depriciated Block8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Support For Depriciated Block8</em>' attribute.
     * @see #isSetSupportForDepriciatedBlock8()
     * @see #unsetSupportForDepriciatedBlock8()
     * @see #getSupportForDepriciatedBlock8()
     * @generated
     */
    void setSupportForDepriciatedBlock8( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPVirtualControlCenter#getSupportForDepriciatedBlock8 <em>Support For Depriciated Block8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSupportForDepriciatedBlock8()
     * @see #getSupportForDepriciatedBlock8()
     * @see #setSupportForDepriciatedBlock8(Boolean)
     * @generated
     */
    void unsetSupportForDepriciatedBlock8();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPVirtualControlCenter#getSupportForDepriciatedBlock8 <em>Support For Depriciated Block8</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Support For Depriciated Block8</em>' attribute is set.
     * @see #unsetSupportForDepriciatedBlock8()
     * @see #getSupportForDepriciatedBlock8()
     * @see #setSupportForDepriciatedBlock8(Boolean)
     * @generated
     */
    boolean isSetSupportForDepriciatedBlock8();

    /**
     * Returns the value of the '<em><b>Transport Security Requirement</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Transport Security Requirement</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Transport Security Requirement</em>' attribute.
     * @see #isSetTransportSecurityRequirement()
     * @see #unsetTransportSecurityRequirement()
     * @see #setTransportSecurityRequirement(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getICCPVirtualControlCenter_TransportSecurityRequirement()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ICCPVirtualControlCenter.TransportSecurityRequirement' kind='element'"
     * @generated
     */
    Boolean getTransportSecurityRequirement();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPVirtualControlCenter#getTransportSecurityRequirement <em>Transport Security Requirement</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transport Security Requirement</em>' attribute.
     * @see #isSetTransportSecurityRequirement()
     * @see #unsetTransportSecurityRequirement()
     * @see #getTransportSecurityRequirement()
     * @generated
     */
    void setTransportSecurityRequirement( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPVirtualControlCenter#getTransportSecurityRequirement <em>Transport Security Requirement</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTransportSecurityRequirement()
     * @see #getTransportSecurityRequirement()
     * @see #setTransportSecurityRequirement(Boolean)
     * @generated
     */
    void unsetTransportSecurityRequirement();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPVirtualControlCenter#getTransportSecurityRequirement <em>Transport Security Requirement</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Transport Security Requirement</em>' attribute is set.
     * @see #unsetTransportSecurityRequirement()
     * @see #getTransportSecurityRequirement()
     * @see #setTransportSecurityRequirement(Boolean)
     * @generated
     */
    boolean isSetTransportSecurityRequirement();

} // ICCPVirtualControlCenter
