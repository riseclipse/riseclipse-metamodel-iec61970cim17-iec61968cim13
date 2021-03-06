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
 * A representation of the model object '<em><b>ASTM Standard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ASTMStandard#getStandardEdition <em>Standard Edition</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ASTMStandard#getStandardNumber <em>Standard Number</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getASTMStandard()
 * @model
 * @generated
 */
public interface ASTMStandard extends EObject {
    /**
     * Returns the value of the '<em><b>Standard Edition</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ASTMStandardEditionKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Standard Edition</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Standard Edition</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ASTMStandardEditionKind
     * @see #isSetStandardEdition()
     * @see #unsetStandardEdition()
     * @see #setStandardEdition(ASTMStandardEditionKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getASTMStandard_StandardEdition()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ASTMStandard.standardEdition' kind='element'"
     * @generated
     */
    ASTMStandardEditionKind getStandardEdition();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ASTMStandard#getStandardEdition <em>Standard Edition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Standard Edition</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ASTMStandardEditionKind
     * @see #isSetStandardEdition()
     * @see #unsetStandardEdition()
     * @see #getStandardEdition()
     * @generated
     */
    void setStandardEdition( ASTMStandardEditionKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ASTMStandard#getStandardEdition <em>Standard Edition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStandardEdition()
     * @see #getStandardEdition()
     * @see #setStandardEdition(ASTMStandardEditionKind)
     * @generated
     */
    void unsetStandardEdition();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ASTMStandard#getStandardEdition <em>Standard Edition</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Standard Edition</em>' attribute is set.
     * @see #unsetStandardEdition()
     * @see #getStandardEdition()
     * @see #setStandardEdition(ASTMStandardEditionKind)
     * @generated
     */
    boolean isSetStandardEdition();

    /**
     * Returns the value of the '<em><b>Standard Number</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ASTMStandardKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Standard Number</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Standard Number</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ASTMStandardKind
     * @see #isSetStandardNumber()
     * @see #unsetStandardNumber()
     * @see #setStandardNumber(ASTMStandardKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getASTMStandard_StandardNumber()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ASTMStandard.standardNumber' kind='element'"
     * @generated
     */
    ASTMStandardKind getStandardNumber();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ASTMStandard#getStandardNumber <em>Standard Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Standard Number</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ASTMStandardKind
     * @see #isSetStandardNumber()
     * @see #unsetStandardNumber()
     * @see #getStandardNumber()
     * @generated
     */
    void setStandardNumber( ASTMStandardKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ASTMStandard#getStandardNumber <em>Standard Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStandardNumber()
     * @see #getStandardNumber()
     * @see #setStandardNumber(ASTMStandardKind)
     * @generated
     */
    void unsetStandardNumber();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ASTMStandard#getStandardNumber <em>Standard Number</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Standard Number</em>' attribute is set.
     * @see #unsetStandardNumber()
     * @see #getStandardNumber()
     * @see #setStandardNumber(ASTMStandardKind)
     * @generated
     */
    boolean isSetStandardNumber();

} // ASTMStandard
