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
 * A representation of the model object '<em><b>Composite Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CompositeSwitch#getCompositeSwitchType <em>Composite Switch Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CompositeSwitch#getSwitches <em>Switches</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCompositeSwitch()
 * @model
 * @generated
 */
public interface CompositeSwitch extends Equipment {
    /**
     * Returns the value of the '<em><b>Composite Switch Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Composite Switch Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Composite Switch Type</em>' attribute.
     * @see #isSetCompositeSwitchType()
     * @see #unsetCompositeSwitchType()
     * @see #setCompositeSwitchType(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCompositeSwitch_CompositeSwitchType()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CompositeSwitch.compositeSwitchType' kind='element'"
     * @generated
     */
    String getCompositeSwitchType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CompositeSwitch#getCompositeSwitchType <em>Composite Switch Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Composite Switch Type</em>' attribute.
     * @see #isSetCompositeSwitchType()
     * @see #unsetCompositeSwitchType()
     * @see #getCompositeSwitchType()
     * @generated
     */
    void setCompositeSwitchType( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CompositeSwitch#getCompositeSwitchType <em>Composite Switch Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCompositeSwitchType()
     * @see #getCompositeSwitchType()
     * @see #setCompositeSwitchType(String)
     * @generated
     */
    void unsetCompositeSwitchType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CompositeSwitch#getCompositeSwitchType <em>Composite Switch Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Composite Switch Type</em>' attribute is set.
     * @see #unsetCompositeSwitchType()
     * @see #getCompositeSwitchType()
     * @see #setCompositeSwitchType(String)
     * @generated
     */
    boolean isSetCompositeSwitchType();

    /**
     * Returns the value of the '<em><b>Switches</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getCompositeSwitch <em>Composite Switch</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Switches</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Switches</em>' reference list.
     * @see #isSetSwitches()
     * @see #unsetSwitches()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCompositeSwitch_Switches()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getCompositeSwitch
     * @model opposite="CompositeSwitch" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CompositeSwitch.Switches' kind='element'"
     * @generated
     */
    EList< Switch > getSwitches();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CompositeSwitch#getSwitches <em>Switches</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSwitches()
     * @see #getSwitches()
     * @generated
     */
    void unsetSwitches();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CompositeSwitch#getSwitches <em>Switches</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Switches</em>' reference list is set.
     * @see #unsetSwitches()
     * @see #getSwitches()
     * @generated
     */
    boolean isSetSwitches();

} // CompositeSwitch
