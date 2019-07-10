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
 * A representation of the model object '<em><b>EPA Standard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EPAStandard#getStandardEdition <em>Standard Edition</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EPAStandard#getStandardNumber <em>Standard Number</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEPAStandard()
 * @model
 * @generated
 */
public interface EPAStandard extends EObject {
    /**
     * Returns the value of the '<em><b>Standard Edition</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EPAStandardEditionKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Standard Edition</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Standard Edition</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EPAStandardEditionKind
     * @see #isSetStandardEdition()
     * @see #unsetStandardEdition()
     * @see #setStandardEdition(EPAStandardEditionKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEPAStandard_StandardEdition()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EPAStandard.standardEdition' kind='element'"
     * @generated
     */
    EPAStandardEditionKind getStandardEdition();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EPAStandard#getStandardEdition <em>Standard Edition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Standard Edition</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EPAStandardEditionKind
     * @see #isSetStandardEdition()
     * @see #unsetStandardEdition()
     * @see #getStandardEdition()
     * @generated
     */
    void setStandardEdition( EPAStandardEditionKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EPAStandard#getStandardEdition <em>Standard Edition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStandardEdition()
     * @see #getStandardEdition()
     * @see #setStandardEdition(EPAStandardEditionKind)
     * @generated
     */
    void unsetStandardEdition();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EPAStandard#getStandardEdition <em>Standard Edition</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Standard Edition</em>' attribute is set.
     * @see #unsetStandardEdition()
     * @see #getStandardEdition()
     * @see #setStandardEdition(EPAStandardEditionKind)
     * @generated
     */
    boolean isSetStandardEdition();

    /**
     * Returns the value of the '<em><b>Standard Number</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EPAStandardKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Standard Number</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Standard Number</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EPAStandardKind
     * @see #isSetStandardNumber()
     * @see #unsetStandardNumber()
     * @see #setStandardNumber(EPAStandardKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEPAStandard_StandardNumber()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='EPAStandard.standardNumber' kind='element'"
     * @generated
     */
    EPAStandardKind getStandardNumber();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EPAStandard#getStandardNumber <em>Standard Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Standard Number</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EPAStandardKind
     * @see #isSetStandardNumber()
     * @see #unsetStandardNumber()
     * @see #getStandardNumber()
     * @generated
     */
    void setStandardNumber( EPAStandardKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EPAStandard#getStandardNumber <em>Standard Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStandardNumber()
     * @see #getStandardNumber()
     * @see #setStandardNumber(EPAStandardKind)
     * @generated
     */
    void unsetStandardNumber();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EPAStandard#getStandardNumber <em>Standard Number</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Standard Number</em>' attribute is set.
     * @see #unsetStandardNumber()
     * @see #getStandardNumber()
     * @see #setStandardNumber(EPAStandardKind)
     * @generated
     */
    boolean isSetStandardNumber();

} // EPAStandard
