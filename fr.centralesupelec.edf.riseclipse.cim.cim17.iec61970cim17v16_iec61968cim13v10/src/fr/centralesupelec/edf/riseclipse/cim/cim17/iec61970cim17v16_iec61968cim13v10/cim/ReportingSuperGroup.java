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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reporting Super Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReportingSuperGroup#getReportingGroup <em>Reporting Group</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getReportingSuperGroup()
 * @model
 * @generated
 */
public interface ReportingSuperGroup extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Reporting Group</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReportingGroup}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReportingGroup#getReportingSuperGroup <em>Reporting Super Group</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reporting Group</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reporting Group</em>' reference list.
     * @see #isSetReportingGroup()
     * @see #unsetReportingGroup()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getReportingSuperGroup_ReportingGroup()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReportingGroup#getReportingSuperGroup
     * @model opposite="ReportingSuperGroup" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ReportingSuperGroup.ReportingGroup' kind='element'"
     * @generated
     */
    EList< ReportingGroup > getReportingGroup();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReportingSuperGroup#getReportingGroup <em>Reporting Group</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReportingGroup()
     * @see #getReportingGroup()
     * @generated
     */
    void unsetReportingGroup();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReportingSuperGroup#getReportingGroup <em>Reporting Group</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Reporting Group</em>' reference list is set.
     * @see #unsetReportingGroup()
     * @see #getReportingGroup()
     * @generated
     */
    boolean isSetReportingGroup();

} // ReportingSuperGroup
