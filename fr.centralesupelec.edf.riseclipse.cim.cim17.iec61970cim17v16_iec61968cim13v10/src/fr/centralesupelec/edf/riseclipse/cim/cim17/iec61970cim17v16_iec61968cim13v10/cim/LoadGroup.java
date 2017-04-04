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
 * A representation of the model object '<em><b>Load Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadGroup#getSubLoadArea <em>Sub Load Area</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadGroup()
 * @model
 * @generated
 */
public interface LoadGroup extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Sub Load Area</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SubLoadArea#getLoadGroups <em>Load Groups</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sub Load Area</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sub Load Area</em>' reference.
     * @see #isSetSubLoadArea()
     * @see #unsetSubLoadArea()
     * @see #setSubLoadArea(SubLoadArea)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLoadGroup_SubLoadArea()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SubLoadArea#getLoadGroups
     * @model opposite="LoadGroups" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LoadGroup.SubLoadArea' kind='element'"
     * @generated
     */
    SubLoadArea getSubLoadArea();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadGroup#getSubLoadArea <em>Sub Load Area</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sub Load Area</em>' reference.
     * @see #isSetSubLoadArea()
     * @see #unsetSubLoadArea()
     * @see #getSubLoadArea()
     * @generated
     */
    void setSubLoadArea( SubLoadArea value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadGroup#getSubLoadArea <em>Sub Load Area</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSubLoadArea()
     * @see #getSubLoadArea()
     * @see #setSubLoadArea(SubLoadArea)
     * @generated
     */
    void unsetSubLoadArea();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadGroup#getSubLoadArea <em>Sub Load Area</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sub Load Area</em>' reference is set.
     * @see #unsetSubLoadArea()
     * @see #getSubLoadArea()
     * @see #setSubLoadArea(SubLoadArea)
     * @generated
     */
    boolean isSetSubLoadArea();

} // LoadGroup
