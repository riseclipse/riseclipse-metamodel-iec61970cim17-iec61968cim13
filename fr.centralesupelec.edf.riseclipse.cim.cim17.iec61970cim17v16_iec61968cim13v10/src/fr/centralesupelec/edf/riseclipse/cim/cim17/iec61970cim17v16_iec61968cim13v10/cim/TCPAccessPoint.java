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
 * A representation of the model object '<em><b>TCP Access Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TCPAccessPoint#getKeepAliveTime <em>Keep Alive Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TCPAccessPoint#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTCPAccessPoint()
 * @model
 * @generated
 */
public interface TCPAccessPoint extends IPAccessPoint {
    /**
     * Returns the value of the '<em><b>Keep Alive Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Keep Alive Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Keep Alive Time</em>' attribute.
     * @see #isSetKeepAliveTime()
     * @see #unsetKeepAliveTime()
     * @see #setKeepAliveTime(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTCPAccessPoint_KeepAliveTime()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TCPAccessPoint.keepAliveTime' kind='element'"
     * @generated
     */
    Integer getKeepAliveTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TCPAccessPoint#getKeepAliveTime <em>Keep Alive Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Keep Alive Time</em>' attribute.
     * @see #isSetKeepAliveTime()
     * @see #unsetKeepAliveTime()
     * @see #getKeepAliveTime()
     * @generated
     */
    void setKeepAliveTime( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TCPAccessPoint#getKeepAliveTime <em>Keep Alive Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKeepAliveTime()
     * @see #getKeepAliveTime()
     * @see #setKeepAliveTime(Integer)
     * @generated
     */
    void unsetKeepAliveTime();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TCPAccessPoint#getKeepAliveTime <em>Keep Alive Time</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Keep Alive Time</em>' attribute is set.
     * @see #unsetKeepAliveTime()
     * @see #getKeepAliveTime()
     * @see #setKeepAliveTime(Integer)
     * @generated
     */
    boolean isSetKeepAliveTime();

    /**
     * Returns the value of the '<em><b>Port</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Port</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Port</em>' attribute.
     * @see #isSetPort()
     * @see #unsetPort()
     * @see #setPort(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTCPAccessPoint_Port()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TCPAccessPoint.port' kind='element'"
     * @generated
     */
    Integer getPort();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TCPAccessPoint#getPort <em>Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Port</em>' attribute.
     * @see #isSetPort()
     * @see #unsetPort()
     * @see #getPort()
     * @generated
     */
    void setPort( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TCPAccessPoint#getPort <em>Port</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPort()
     * @see #getPort()
     * @see #setPort(Integer)
     * @generated
     */
    void unsetPort();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TCPAccessPoint#getPort <em>Port</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Port</em>' attribute is set.
     * @see #unsetPort()
     * @see #getPort()
     * @see #setPort(Integer)
     * @generated
     */
    boolean isSetPort();

} // TCPAccessPoint
