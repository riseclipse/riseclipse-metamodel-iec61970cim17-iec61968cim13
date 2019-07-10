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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doble Standard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DobleStandard#getStandardEdition <em>Standard Edition</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DobleStandard#getStandardNumber <em>Standard Number</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDobleStandard()
 * @model
 * @generated
 */
public interface DobleStandard extends EObject {
    /**
     * Returns the value of the '<em><b>Standard Edition</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DobleStandardEditionKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Standard Edition</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Standard Edition</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DobleStandardEditionKind
     * @see #isSetStandardEdition()
     * @see #unsetStandardEdition()
     * @see #setStandardEdition(DobleStandardEditionKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDobleStandard_StandardEdition()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DobleStandard.standardEdition' kind='element'"
     * @generated
     */
    DobleStandardEditionKind getStandardEdition();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DobleStandard#getStandardEdition <em>Standard Edition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Standard Edition</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DobleStandardEditionKind
     * @see #isSetStandardEdition()
     * @see #unsetStandardEdition()
     * @see #getStandardEdition()
     * @generated
     */
    void setStandardEdition( DobleStandardEditionKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DobleStandard#getStandardEdition <em>Standard Edition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStandardEdition()
     * @see #getStandardEdition()
     * @see #setStandardEdition(DobleStandardEditionKind)
     * @generated
     */
    void unsetStandardEdition();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DobleStandard#getStandardEdition <em>Standard Edition</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Standard Edition</em>' attribute is set.
     * @see #unsetStandardEdition()
     * @see #getStandardEdition()
     * @see #setStandardEdition(DobleStandardEditionKind)
     * @generated
     */
    boolean isSetStandardEdition();

    /**
     * Returns the value of the '<em><b>Standard Number</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DobleStandardKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Standard Number</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Standard Number</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DobleStandardKind
     * @see #isSetStandardNumber()
     * @see #unsetStandardNumber()
     * @see #setStandardNumber(DobleStandardKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDobleStandard_StandardNumber()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DobleStandard.standardNumber' kind='element'"
     * @generated
     */
    DobleStandardKind getStandardNumber();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DobleStandard#getStandardNumber <em>Standard Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Standard Number</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DobleStandardKind
     * @see #isSetStandardNumber()
     * @see #unsetStandardNumber()
     * @see #getStandardNumber()
     * @generated
     */
    void setStandardNumber( DobleStandardKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DobleStandard#getStandardNumber <em>Standard Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStandardNumber()
     * @see #getStandardNumber()
     * @see #setStandardNumber(DobleStandardKind)
     * @generated
     */
    void unsetStandardNumber();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DobleStandard#getStandardNumber <em>Standard Number</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Standard Number</em>' attribute is set.
     * @see #unsetStandardNumber()
     * @see #getStandardNumber()
     * @see #setStandardNumber(DobleStandardKind)
     * @generated
     */
    boolean isSetStandardNumber();

} // DobleStandard
