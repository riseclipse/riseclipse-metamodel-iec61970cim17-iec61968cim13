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
 * A representation of the model object '<em><b>Connect Disconnect Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectDisconnectFunction#getEventCount <em>Event Count</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectDisconnectFunction#getIsConnected <em>Is Connected</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectDisconnectFunction#getIsDelayedDiscon <em>Is Delayed Discon</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectDisconnectFunction#getIsLocalAutoDisconOp <em>Is Local Auto Discon Op</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectDisconnectFunction#getIsLocalAutoReconOp <em>Is Local Auto Recon Op</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectDisconnectFunction#getIsRemoteAutoDisconOp <em>Is Remote Auto Discon Op</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectDisconnectFunction#getIsRemoteAutoReconOp <em>Is Remote Auto Recon Op</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectDisconnectFunction#getRcdInfo <em>Rcd Info</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectDisconnectFunction#getSwitches <em>Switches</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getConnectDisconnectFunction()
 * @model
 * @generated
 */
public interface ConnectDisconnectFunction extends EndDeviceFunction {
    /**
     * Returns the value of the '<em><b>Event Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Event Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Event Count</em>' attribute.
     * @see #isSetEventCount()
     * @see #unsetEventCount()
     * @see #setEventCount(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getConnectDisconnectFunction_EventCount()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ConnectDisconnectFunction.eventCount' kind='element'"
     * @generated
     */
    Integer getEventCount();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectDisconnectFunction#getEventCount <em>Event Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Event Count</em>' attribute.
     * @see #isSetEventCount()
     * @see #unsetEventCount()
     * @see #getEventCount()
     * @generated
     */
    void setEventCount( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectDisconnectFunction#getEventCount <em>Event Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEventCount()
     * @see #getEventCount()
     * @see #setEventCount(Integer)
     * @generated
     */
    void unsetEventCount();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectDisconnectFunction#getEventCount <em>Event Count</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Event Count</em>' attribute is set.
     * @see #unsetEventCount()
     * @see #getEventCount()
     * @see #setEventCount(Integer)
     * @generated
     */
    boolean isSetEventCount();

    /**
     * Returns the value of the '<em><b>Is Connected</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Connected</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Connected</em>' attribute.
     * @see #isSetIsConnected()
     * @see #unsetIsConnected()
     * @see #setIsConnected(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getConnectDisconnectFunction_IsConnected()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ConnectDisconnectFunction.isConnected' kind='element'"
     * @generated
     */
    Boolean getIsConnected();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectDisconnectFunction#getIsConnected <em>Is Connected</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Connected</em>' attribute.
     * @see #isSetIsConnected()
     * @see #unsetIsConnected()
     * @see #getIsConnected()
     * @generated
     */
    void setIsConnected( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectDisconnectFunction#getIsConnected <em>Is Connected</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsConnected()
     * @see #getIsConnected()
     * @see #setIsConnected(Boolean)
     * @generated
     */
    void unsetIsConnected();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectDisconnectFunction#getIsConnected <em>Is Connected</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Connected</em>' attribute is set.
     * @see #unsetIsConnected()
     * @see #getIsConnected()
     * @see #setIsConnected(Boolean)
     * @generated
     */
    boolean isSetIsConnected();

    /**
     * Returns the value of the '<em><b>Is Delayed Discon</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Delayed Discon</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Delayed Discon</em>' attribute.
     * @see #isSetIsDelayedDiscon()
     * @see #unsetIsDelayedDiscon()
     * @see #setIsDelayedDiscon(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getConnectDisconnectFunction_IsDelayedDiscon()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ConnectDisconnectFunction.isDelayedDiscon' kind='element'"
     * @generated
     */
    Boolean getIsDelayedDiscon();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectDisconnectFunction#getIsDelayedDiscon <em>Is Delayed Discon</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Delayed Discon</em>' attribute.
     * @see #isSetIsDelayedDiscon()
     * @see #unsetIsDelayedDiscon()
     * @see #getIsDelayedDiscon()
     * @generated
     */
    void setIsDelayedDiscon( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectDisconnectFunction#getIsDelayedDiscon <em>Is Delayed Discon</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsDelayedDiscon()
     * @see #getIsDelayedDiscon()
     * @see #setIsDelayedDiscon(Boolean)
     * @generated
     */
    void unsetIsDelayedDiscon();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectDisconnectFunction#getIsDelayedDiscon <em>Is Delayed Discon</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Delayed Discon</em>' attribute is set.
     * @see #unsetIsDelayedDiscon()
     * @see #getIsDelayedDiscon()
     * @see #setIsDelayedDiscon(Boolean)
     * @generated
     */
    boolean isSetIsDelayedDiscon();

    /**
     * Returns the value of the '<em><b>Is Local Auto Discon Op</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Local Auto Discon Op</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Local Auto Discon Op</em>' attribute.
     * @see #isSetIsLocalAutoDisconOp()
     * @see #unsetIsLocalAutoDisconOp()
     * @see #setIsLocalAutoDisconOp(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getConnectDisconnectFunction_IsLocalAutoDisconOp()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ConnectDisconnectFunction.isLocalAutoDisconOp' kind='element'"
     * @generated
     */
    Boolean getIsLocalAutoDisconOp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectDisconnectFunction#getIsLocalAutoDisconOp <em>Is Local Auto Discon Op</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Local Auto Discon Op</em>' attribute.
     * @see #isSetIsLocalAutoDisconOp()
     * @see #unsetIsLocalAutoDisconOp()
     * @see #getIsLocalAutoDisconOp()
     * @generated
     */
    void setIsLocalAutoDisconOp( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectDisconnectFunction#getIsLocalAutoDisconOp <em>Is Local Auto Discon Op</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsLocalAutoDisconOp()
     * @see #getIsLocalAutoDisconOp()
     * @see #setIsLocalAutoDisconOp(Boolean)
     * @generated
     */
    void unsetIsLocalAutoDisconOp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectDisconnectFunction#getIsLocalAutoDisconOp <em>Is Local Auto Discon Op</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Local Auto Discon Op</em>' attribute is set.
     * @see #unsetIsLocalAutoDisconOp()
     * @see #getIsLocalAutoDisconOp()
     * @see #setIsLocalAutoDisconOp(Boolean)
     * @generated
     */
    boolean isSetIsLocalAutoDisconOp();

    /**
     * Returns the value of the '<em><b>Is Local Auto Recon Op</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Local Auto Recon Op</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Local Auto Recon Op</em>' attribute.
     * @see #isSetIsLocalAutoReconOp()
     * @see #unsetIsLocalAutoReconOp()
     * @see #setIsLocalAutoReconOp(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getConnectDisconnectFunction_IsLocalAutoReconOp()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ConnectDisconnectFunction.isLocalAutoReconOp' kind='element'"
     * @generated
     */
    Boolean getIsLocalAutoReconOp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectDisconnectFunction#getIsLocalAutoReconOp <em>Is Local Auto Recon Op</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Local Auto Recon Op</em>' attribute.
     * @see #isSetIsLocalAutoReconOp()
     * @see #unsetIsLocalAutoReconOp()
     * @see #getIsLocalAutoReconOp()
     * @generated
     */
    void setIsLocalAutoReconOp( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectDisconnectFunction#getIsLocalAutoReconOp <em>Is Local Auto Recon Op</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsLocalAutoReconOp()
     * @see #getIsLocalAutoReconOp()
     * @see #setIsLocalAutoReconOp(Boolean)
     * @generated
     */
    void unsetIsLocalAutoReconOp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectDisconnectFunction#getIsLocalAutoReconOp <em>Is Local Auto Recon Op</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Local Auto Recon Op</em>' attribute is set.
     * @see #unsetIsLocalAutoReconOp()
     * @see #getIsLocalAutoReconOp()
     * @see #setIsLocalAutoReconOp(Boolean)
     * @generated
     */
    boolean isSetIsLocalAutoReconOp();

    /**
     * Returns the value of the '<em><b>Is Remote Auto Discon Op</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Remote Auto Discon Op</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Remote Auto Discon Op</em>' attribute.
     * @see #isSetIsRemoteAutoDisconOp()
     * @see #unsetIsRemoteAutoDisconOp()
     * @see #setIsRemoteAutoDisconOp(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getConnectDisconnectFunction_IsRemoteAutoDisconOp()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ConnectDisconnectFunction.isRemoteAutoDisconOp' kind='element'"
     * @generated
     */
    Boolean getIsRemoteAutoDisconOp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectDisconnectFunction#getIsRemoteAutoDisconOp <em>Is Remote Auto Discon Op</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Remote Auto Discon Op</em>' attribute.
     * @see #isSetIsRemoteAutoDisconOp()
     * @see #unsetIsRemoteAutoDisconOp()
     * @see #getIsRemoteAutoDisconOp()
     * @generated
     */
    void setIsRemoteAutoDisconOp( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectDisconnectFunction#getIsRemoteAutoDisconOp <em>Is Remote Auto Discon Op</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsRemoteAutoDisconOp()
     * @see #getIsRemoteAutoDisconOp()
     * @see #setIsRemoteAutoDisconOp(Boolean)
     * @generated
     */
    void unsetIsRemoteAutoDisconOp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectDisconnectFunction#getIsRemoteAutoDisconOp <em>Is Remote Auto Discon Op</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Remote Auto Discon Op</em>' attribute is set.
     * @see #unsetIsRemoteAutoDisconOp()
     * @see #getIsRemoteAutoDisconOp()
     * @see #setIsRemoteAutoDisconOp(Boolean)
     * @generated
     */
    boolean isSetIsRemoteAutoDisconOp();

    /**
     * Returns the value of the '<em><b>Is Remote Auto Recon Op</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Remote Auto Recon Op</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Remote Auto Recon Op</em>' attribute.
     * @see #isSetIsRemoteAutoReconOp()
     * @see #unsetIsRemoteAutoReconOp()
     * @see #setIsRemoteAutoReconOp(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getConnectDisconnectFunction_IsRemoteAutoReconOp()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ConnectDisconnectFunction.isRemoteAutoReconOp' kind='element'"
     * @generated
     */
    Boolean getIsRemoteAutoReconOp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectDisconnectFunction#getIsRemoteAutoReconOp <em>Is Remote Auto Recon Op</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Remote Auto Recon Op</em>' attribute.
     * @see #isSetIsRemoteAutoReconOp()
     * @see #unsetIsRemoteAutoReconOp()
     * @see #getIsRemoteAutoReconOp()
     * @generated
     */
    void setIsRemoteAutoReconOp( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectDisconnectFunction#getIsRemoteAutoReconOp <em>Is Remote Auto Recon Op</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsRemoteAutoReconOp()
     * @see #getIsRemoteAutoReconOp()
     * @see #setIsRemoteAutoReconOp(Boolean)
     * @generated
     */
    void unsetIsRemoteAutoReconOp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectDisconnectFunction#getIsRemoteAutoReconOp <em>Is Remote Auto Recon Op</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Remote Auto Recon Op</em>' attribute is set.
     * @see #unsetIsRemoteAutoReconOp()
     * @see #getIsRemoteAutoReconOp()
     * @see #setIsRemoteAutoReconOp(Boolean)
     * @generated
     */
    boolean isSetIsRemoteAutoReconOp();

    /**
     * Returns the value of the '<em><b>Rcd Info</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rcd Info</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rcd Info</em>' containment reference.
     * @see #isSetRcdInfo()
     * @see #unsetRcdInfo()
     * @see #setRcdInfo(RemoteConnectDisconnectInfo)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getConnectDisconnectFunction_RcdInfo()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ConnectDisconnectFunction.rcdInfo' kind='element'"
     * @generated
     */
    RemoteConnectDisconnectInfo getRcdInfo();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectDisconnectFunction#getRcdInfo <em>Rcd Info</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rcd Info</em>' containment reference.
     * @see #isSetRcdInfo()
     * @see #unsetRcdInfo()
     * @see #getRcdInfo()
     * @generated
     */
    void setRcdInfo( RemoteConnectDisconnectInfo value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectDisconnectFunction#getRcdInfo <em>Rcd Info</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRcdInfo()
     * @see #getRcdInfo()
     * @see #setRcdInfo(RemoteConnectDisconnectInfo)
     * @generated
     */
    void unsetRcdInfo();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectDisconnectFunction#getRcdInfo <em>Rcd Info</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rcd Info</em>' containment reference is set.
     * @see #unsetRcdInfo()
     * @see #getRcdInfo()
     * @see #setRcdInfo(RemoteConnectDisconnectInfo)
     * @generated
     */
    boolean isSetRcdInfo();

    /**
     * Returns the value of the '<em><b>Switches</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getConnectDisconnectFunctions <em>Connect Disconnect Functions</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Switches</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Switches</em>' reference list.
     * @see #isSetSwitches()
     * @see #unsetSwitches()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getConnectDisconnectFunction_Switches()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getConnectDisconnectFunctions
     * @model opposite="ConnectDisconnectFunctions" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ConnectDisconnectFunction.Switches' kind='element'"
     * @generated
     */
    EList< Switch > getSwitches();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectDisconnectFunction#getSwitches <em>Switches</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSwitches()
     * @see #getSwitches()
     * @generated
     */
    void unsetSwitches();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectDisconnectFunction#getSwitches <em>Switches</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Switches</em>' reference list is set.
     * @see #unsetSwitches()
     * @see #getSwitches()
     * @generated
     */
    boolean isSetSwitches();

} // ConnectDisconnectFunction
