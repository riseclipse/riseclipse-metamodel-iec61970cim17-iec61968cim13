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
 * A representation of the model object '<em><b>DER Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERCapabilities#getDERGroupDispatch <em>DER Group Dispatch</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDERCapabilities()
 * @model
 * @generated
 */
public interface DERCapabilities extends CimObjectWithID {
    /**
     * Returns the value of the '<em><b>DER Group Dispatch</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupDispatch#getDERCapabilities <em>DER Capabilities</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DER Group Dispatch</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DER Group Dispatch</em>' reference.
     * @see #isSetDERGroupDispatch()
     * @see #unsetDERGroupDispatch()
     * @see #setDERGroupDispatch(DERGroupDispatch)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDERCapabilities_DERGroupDispatch()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupDispatch#getDERCapabilities
     * @model opposite="DERCapabilities" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DERCapabilities.DERGroupDispatch' kind='element'"
     * @generated
     */
    DERGroupDispatch getDERGroupDispatch();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERCapabilities#getDERGroupDispatch <em>DER Group Dispatch</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DER Group Dispatch</em>' reference.
     * @see #isSetDERGroupDispatch()
     * @see #unsetDERGroupDispatch()
     * @see #getDERGroupDispatch()
     * @generated
     */
    void setDERGroupDispatch( DERGroupDispatch value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERCapabilities#getDERGroupDispatch <em>DER Group Dispatch</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDERGroupDispatch()
     * @see #getDERGroupDispatch()
     * @see #setDERGroupDispatch(DERGroupDispatch)
     * @generated
     */
    void unsetDERGroupDispatch();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERCapabilities#getDERGroupDispatch <em>DER Group Dispatch</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>DER Group Dispatch</em>' reference is set.
     * @see #unsetDERGroupDispatch()
     * @see #getDERGroupDispatch()
     * @see #setDERGroupDispatch(DERGroupDispatch)
     * @generated
     */
    boolean isSetDERGroupDispatch();

} // DERCapabilities
