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
 * A representation of the model object '<em><b>DER Group Dispatch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupDispatch#getDERCapabilities <em>DER Capabilities</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupDispatch#getEndDeviceGroup <em>End Device Group</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDERGroupDispatch()
 * @model
 * @generated
 */
public interface DERGroupDispatch extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>DER Capabilities</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERCapabilities#getDERGroupDispatch <em>DER Group Dispatch</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DER Capabilities</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DER Capabilities</em>' reference.
     * @see #isSetDERCapabilities()
     * @see #unsetDERCapabilities()
     * @see #setDERCapabilities(DERCapabilities)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDERGroupDispatch_DERCapabilities()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERCapabilities#getDERGroupDispatch
     * @model opposite="DERGroupDispatch" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DERGroupDispatch.DERCapabilities' kind='element'"
     * @generated
     */
    DERCapabilities getDERCapabilities();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupDispatch#getDERCapabilities <em>DER Capabilities</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DER Capabilities</em>' reference.
     * @see #isSetDERCapabilities()
     * @see #unsetDERCapabilities()
     * @see #getDERCapabilities()
     * @generated
     */
    void setDERCapabilities( DERCapabilities value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupDispatch#getDERCapabilities <em>DER Capabilities</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDERCapabilities()
     * @see #getDERCapabilities()
     * @see #setDERCapabilities(DERCapabilities)
     * @generated
     */
    void unsetDERCapabilities();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupDispatch#getDERCapabilities <em>DER Capabilities</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>DER Capabilities</em>' reference is set.
     * @see #unsetDERCapabilities()
     * @see #getDERCapabilities()
     * @see #setDERCapabilities(DERCapabilities)
     * @generated
     */
    boolean isSetDERCapabilities();

    /**
     * Returns the value of the '<em><b>End Device Group</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceGroup}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceGroup#getDERGroupDispatch <em>DER Group Dispatch</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>End Device Group</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>End Device Group</em>' reference list.
     * @see #isSetEndDeviceGroup()
     * @see #unsetEndDeviceGroup()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDERGroupDispatch_EndDeviceGroup()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceGroup#getDERGroupDispatch
     * @model opposite="DERGroupDispatch" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DERGroupDispatch.EndDeviceGroup' kind='element'"
     * @generated
     */
    EList< EndDeviceGroup > getEndDeviceGroup();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupDispatch#getEndDeviceGroup <em>End Device Group</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEndDeviceGroup()
     * @see #getEndDeviceGroup()
     * @generated
     */
    void unsetEndDeviceGroup();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupDispatch#getEndDeviceGroup <em>End Device Group</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>End Device Group</em>' reference list is set.
     * @see #unsetEndDeviceGroup()
     * @see #getEndDeviceGroup()
     * @generated
     */
    boolean isSetEndDeviceGroup();

} // DERGroupDispatch
