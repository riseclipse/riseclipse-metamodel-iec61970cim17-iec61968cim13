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
 * A representation of the model object '<em><b>Contingency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Contingency#getMustStudy <em>Must Study</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Contingency#getContingencyElement <em>Contingency Element</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getContingency()
 * @model
 * @generated
 */
public interface Contingency extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Must Study</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Must Study</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Must Study</em>' attribute.
     * @see #isSetMustStudy()
     * @see #unsetMustStudy()
     * @see #setMustStudy(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getContingency_MustStudy()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Contingency.mustStudy' kind='element'"
     * @generated
     */
    Boolean getMustStudy();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Contingency#getMustStudy <em>Must Study</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Must Study</em>' attribute.
     * @see #isSetMustStudy()
     * @see #unsetMustStudy()
     * @see #getMustStudy()
     * @generated
     */
    void setMustStudy( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Contingency#getMustStudy <em>Must Study</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMustStudy()
     * @see #getMustStudy()
     * @see #setMustStudy(Boolean)
     * @generated
     */
    void unsetMustStudy();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Contingency#getMustStudy <em>Must Study</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Must Study</em>' attribute is set.
     * @see #unsetMustStudy()
     * @see #getMustStudy()
     * @see #setMustStudy(Boolean)
     * @generated
     */
    boolean isSetMustStudy();

    /**
     * Returns the value of the '<em><b>Contingency Element</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ContingencyElement}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ContingencyElement#getContingency <em>Contingency</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Contingency Element</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Contingency Element</em>' reference list.
     * @see #isSetContingencyElement()
     * @see #unsetContingencyElement()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getContingency_ContingencyElement()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ContingencyElement#getContingency
     * @model opposite="Contingency" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Contingency.ContingencyElement' kind='element'"
     * @generated
     */
    EList< ContingencyElement > getContingencyElement();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Contingency#getContingencyElement <em>Contingency Element</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetContingencyElement()
     * @see #getContingencyElement()
     * @generated
     */
    void unsetContingencyElement();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Contingency#getContingencyElement <em>Contingency Element</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Contingency Element</em>' reference list is set.
     * @see #unsetContingencyElement()
     * @see #getContingencyElement()
     * @generated
     */
    boolean isSetContingencyElement();

} // Contingency
