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
 * A representation of the model object '<em><b>Remote Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemotePoint#getRemoteUnit <em>Remote Unit</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRemotePoint()
 * @model
 * @generated
 */
public interface RemotePoint extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Remote Unit</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteUnit#getRemotePoints <em>Remote Points</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Remote Unit</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Remote Unit</em>' reference.
     * @see #isSetRemoteUnit()
     * @see #unsetRemoteUnit()
     * @see #setRemoteUnit(RemoteUnit)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRemotePoint_RemoteUnit()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteUnit#getRemotePoints
     * @model opposite="RemotePoints" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RemotePoint.RemoteUnit' kind='element'"
     * @generated
     */
    RemoteUnit getRemoteUnit();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemotePoint#getRemoteUnit <em>Remote Unit</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Remote Unit</em>' reference.
     * @see #isSetRemoteUnit()
     * @see #unsetRemoteUnit()
     * @see #getRemoteUnit()
     * @generated
     */
    void setRemoteUnit( RemoteUnit value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemotePoint#getRemoteUnit <em>Remote Unit</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRemoteUnit()
     * @see #getRemoteUnit()
     * @see #setRemoteUnit(RemoteUnit)
     * @generated
     */
    void unsetRemoteUnit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemotePoint#getRemoteUnit <em>Remote Unit</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Remote Unit</em>' reference is set.
     * @see #unsetRemoteUnit()
     * @see #getRemoteUnit()
     * @see #setRemoteUnit(RemoteUnit)
     * @generated
     */
    boolean isSetRemoteUnit();

} // RemotePoint
