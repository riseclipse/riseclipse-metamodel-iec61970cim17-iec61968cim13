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
 * A representation of the model object '<em><b>Instance Set Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InstanceSetMember#getInstanceSet <em>Instance Set</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getInstanceSetMember()
 * @model
 * @generated
 */
public interface InstanceSetMember extends DataSetMember {
    /**
     * Returns the value of the '<em><b>Instance Set</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InstanceSet#getInstanceSetMember <em>Instance Set Member</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instance Set</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instance Set</em>' reference.
     * @see #isSetInstanceSet()
     * @see #unsetInstanceSet()
     * @see #setInstanceSet(InstanceSet)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getInstanceSetMember_InstanceSet()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InstanceSet#getInstanceSetMember
     * @model opposite="InstanceSetMember" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='InstanceSetMember.InstanceSet' kind='element'"
     * @generated
     */
    InstanceSet getInstanceSet();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InstanceSetMember#getInstanceSet <em>Instance Set</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Instance Set</em>' reference.
     * @see #isSetInstanceSet()
     * @see #unsetInstanceSet()
     * @see #getInstanceSet()
     * @generated
     */
    void setInstanceSet( InstanceSet value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InstanceSetMember#getInstanceSet <em>Instance Set</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInstanceSet()
     * @see #getInstanceSet()
     * @see #setInstanceSet(InstanceSet)
     * @generated
     */
    void unsetInstanceSet();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InstanceSetMember#getInstanceSet <em>Instance Set</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Instance Set</em>' reference is set.
     * @see #unsetInstanceSet()
     * @see #getInstanceSet()
     * @see #setInstanceSet(InstanceSet)
     * @generated
     */
    boolean isSetInstanceSet();

} // InstanceSetMember
