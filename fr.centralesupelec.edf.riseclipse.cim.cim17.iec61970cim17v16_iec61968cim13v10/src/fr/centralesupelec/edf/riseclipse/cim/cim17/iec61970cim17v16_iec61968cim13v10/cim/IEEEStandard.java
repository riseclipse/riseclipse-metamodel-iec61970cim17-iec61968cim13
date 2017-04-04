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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IEEE Standard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IEEEStandard#getStandardEdition <em>Standard Edition</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IEEEStandard#getStandardNumber <em>Standard Number</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getIEEEStandard()
 * @model
 * @generated
 */
public interface IEEEStandard extends EObject {
    /**
     * Returns the value of the '<em><b>Standard Edition</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IEEEStandardEditionKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Standard Edition</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Standard Edition</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IEEEStandardEditionKind
     * @see #isSetStandardEdition()
     * @see #unsetStandardEdition()
     * @see #setStandardEdition(IEEEStandardEditionKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getIEEEStandard_StandardEdition()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='IEEEStandard.standardEdition' kind='element'"
     * @generated
     */
    IEEEStandardEditionKind getStandardEdition();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IEEEStandard#getStandardEdition <em>Standard Edition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Standard Edition</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IEEEStandardEditionKind
     * @see #isSetStandardEdition()
     * @see #unsetStandardEdition()
     * @see #getStandardEdition()
     * @generated
     */
    void setStandardEdition( IEEEStandardEditionKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IEEEStandard#getStandardEdition <em>Standard Edition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStandardEdition()
     * @see #getStandardEdition()
     * @see #setStandardEdition(IEEEStandardEditionKind)
     * @generated
     */
    void unsetStandardEdition();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IEEEStandard#getStandardEdition <em>Standard Edition</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Standard Edition</em>' attribute is set.
     * @see #unsetStandardEdition()
     * @see #getStandardEdition()
     * @see #setStandardEdition(IEEEStandardEditionKind)
     * @generated
     */
    boolean isSetStandardEdition();

    /**
     * Returns the value of the '<em><b>Standard Number</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IEEEStandardKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Standard Number</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Standard Number</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IEEEStandardKind
     * @see #isSetStandardNumber()
     * @see #unsetStandardNumber()
     * @see #setStandardNumber(IEEEStandardKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getIEEEStandard_StandardNumber()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='IEEEStandard.standardNumber' kind='element'"
     * @generated
     */
    IEEEStandardKind getStandardNumber();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IEEEStandard#getStandardNumber <em>Standard Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Standard Number</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IEEEStandardKind
     * @see #isSetStandardNumber()
     * @see #unsetStandardNumber()
     * @see #getStandardNumber()
     * @generated
     */
    void setStandardNumber( IEEEStandardKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IEEEStandard#getStandardNumber <em>Standard Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStandardNumber()
     * @see #getStandardNumber()
     * @see #setStandardNumber(IEEEStandardKind)
     * @generated
     */
    void unsetStandardNumber();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IEEEStandard#getStandardNumber <em>Standard Number</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Standard Number</em>' attribute is set.
     * @see #unsetStandardNumber()
     * @see #getStandardNumber()
     * @see #setStandardNumber(IEEEStandardKind)
     * @generated
     */
    boolean isSetStandardNumber();

} // IEEEStandard
