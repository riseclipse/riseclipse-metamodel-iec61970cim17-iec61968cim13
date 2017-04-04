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
 * A representation of the model object '<em><b>Interrupter Unit Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InterrupterUnitInfo#getInterruptingMedium <em>Interrupting Medium</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getInterrupterUnitInfo()
 * @model
 * @generated
 */
public interface InterrupterUnitInfo extends AssetInfo {
    /**
     * Returns the value of the '<em><b>Interrupting Medium</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InterruptingMediumKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interrupting Medium</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Interrupting Medium</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InterruptingMediumKind
     * @see #isSetInterruptingMedium()
     * @see #unsetInterruptingMedium()
     * @see #setInterruptingMedium(InterruptingMediumKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getInterrupterUnitInfo_InterruptingMedium()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='InterrupterUnitInfo.interruptingMedium' kind='element'"
     * @generated
     */
    InterruptingMediumKind getInterruptingMedium();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InterrupterUnitInfo#getInterruptingMedium <em>Interrupting Medium</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Interrupting Medium</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InterruptingMediumKind
     * @see #isSetInterruptingMedium()
     * @see #unsetInterruptingMedium()
     * @see #getInterruptingMedium()
     * @generated
     */
    void setInterruptingMedium( InterruptingMediumKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InterrupterUnitInfo#getInterruptingMedium <em>Interrupting Medium</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInterruptingMedium()
     * @see #getInterruptingMedium()
     * @see #setInterruptingMedium(InterruptingMediumKind)
     * @generated
     */
    void unsetInterruptingMedium();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InterrupterUnitInfo#getInterruptingMedium <em>Interrupting Medium</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Interrupting Medium</em>' attribute is set.
     * @see #unsetInterruptingMedium()
     * @see #getInterruptingMedium()
     * @see #setInterruptingMedium(InterruptingMediumKind)
     * @generated
     */
    boolean isSetInterruptingMedium();

} // InterrupterUnitInfo
