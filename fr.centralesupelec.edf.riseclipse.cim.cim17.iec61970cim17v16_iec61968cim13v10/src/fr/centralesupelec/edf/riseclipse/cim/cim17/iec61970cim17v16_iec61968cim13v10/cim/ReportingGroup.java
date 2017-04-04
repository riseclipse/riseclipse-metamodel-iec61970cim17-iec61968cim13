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
 * A representation of the model object '<em><b>Reporting Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReportingGroup#getReportingSuperGroup <em>Reporting Super Group</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReportingGroup#getBusNameMarker <em>Bus Name Marker</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReportingGroup#getTopologicalNode <em>Topological Node</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReportingGroup#getPowerSystemResource <em>Power System Resource</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getReportingGroup()
 * @model
 * @generated
 */
public interface ReportingGroup extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Reporting Super Group</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReportingSuperGroup#getReportingGroup <em>Reporting Group</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reporting Super Group</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reporting Super Group</em>' reference.
     * @see #isSetReportingSuperGroup()
     * @see #unsetReportingSuperGroup()
     * @see #setReportingSuperGroup(ReportingSuperGroup)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getReportingGroup_ReportingSuperGroup()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReportingSuperGroup#getReportingGroup
     * @model opposite="ReportingGroup" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ReportingGroup.ReportingSuperGroup' kind='element'"
     * @generated
     */
    ReportingSuperGroup getReportingSuperGroup();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReportingGroup#getReportingSuperGroup <em>Reporting Super Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reporting Super Group</em>' reference.
     * @see #isSetReportingSuperGroup()
     * @see #unsetReportingSuperGroup()
     * @see #getReportingSuperGroup()
     * @generated
     */
    void setReportingSuperGroup( ReportingSuperGroup value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReportingGroup#getReportingSuperGroup <em>Reporting Super Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReportingSuperGroup()
     * @see #getReportingSuperGroup()
     * @see #setReportingSuperGroup(ReportingSuperGroup)
     * @generated
     */
    void unsetReportingSuperGroup();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReportingGroup#getReportingSuperGroup <em>Reporting Super Group</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Reporting Super Group</em>' reference is set.
     * @see #unsetReportingSuperGroup()
     * @see #getReportingSuperGroup()
     * @see #setReportingSuperGroup(ReportingSuperGroup)
     * @generated
     */
    boolean isSetReportingSuperGroup();

    /**
     * Returns the value of the '<em><b>Bus Name Marker</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BusNameMarker}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BusNameMarker#getReportingGroup <em>Reporting Group</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bus Name Marker</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Bus Name Marker</em>' reference list.
     * @see #isSetBusNameMarker()
     * @see #unsetBusNameMarker()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getReportingGroup_BusNameMarker()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BusNameMarker#getReportingGroup
     * @model opposite="ReportingGroup" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ReportingGroup.BusNameMarker' kind='element'"
     * @generated
     */
    EList< BusNameMarker > getBusNameMarker();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReportingGroup#getBusNameMarker <em>Bus Name Marker</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBusNameMarker()
     * @see #getBusNameMarker()
     * @generated
     */
    void unsetBusNameMarker();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReportingGroup#getBusNameMarker <em>Bus Name Marker</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Bus Name Marker</em>' reference list is set.
     * @see #unsetBusNameMarker()
     * @see #getBusNameMarker()
     * @generated
     */
    boolean isSetBusNameMarker();

    /**
     * Returns the value of the '<em><b>Topological Node</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode#getReportingGroup <em>Reporting Group</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Topological Node</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Topological Node</em>' reference list.
     * @see #isSetTopologicalNode()
     * @see #unsetTopologicalNode()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getReportingGroup_TopologicalNode()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode#getReportingGroup
     * @model opposite="ReportingGroup" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ReportingGroup.TopologicalNode' kind='element'"
     * @generated
     */
    EList< TopologicalNode > getTopologicalNode();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReportingGroup#getTopologicalNode <em>Topological Node</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTopologicalNode()
     * @see #getTopologicalNode()
     * @generated
     */
    void unsetTopologicalNode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReportingGroup#getTopologicalNode <em>Topological Node</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Topological Node</em>' reference list is set.
     * @see #unsetTopologicalNode()
     * @see #getTopologicalNode()
     * @generated
     */
    boolean isSetTopologicalNode();

    /**
     * Returns the value of the '<em><b>Power System Resource</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource#getReportingGroup <em>Reporting Group</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Power System Resource</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Power System Resource</em>' reference list.
     * @see #isSetPowerSystemResource()
     * @see #unsetPowerSystemResource()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getReportingGroup_PowerSystemResource()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource#getReportingGroup
     * @model opposite="ReportingGroup" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ReportingGroup.PowerSystemResource' kind='element'"
     * @generated
     */
    EList< PowerSystemResource > getPowerSystemResource();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReportingGroup#getPowerSystemResource <em>Power System Resource</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPowerSystemResource()
     * @see #getPowerSystemResource()
     * @generated
     */
    void unsetPowerSystemResource();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReportingGroup#getPowerSystemResource <em>Power System Resource</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Power System Resource</em>' reference list is set.
     * @see #unsetPowerSystemResource()
     * @see #getPowerSystemResource()
     * @generated
     */
    boolean isSetPowerSystemResource();

} // ReportingGroup
