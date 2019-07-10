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
 * A representation of the model object '<em><b>Topological Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode#getPInjection <em>PInjection</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode#getQInjection <em>QInjection</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode#getConnectivityNodes <em>Connectivity Nodes</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode#getSvInjection <em>Sv Injection</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode#getBusNameMarker <em>Bus Name Marker</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode#getAngleRefTopologicalIsland <em>Angle Ref Topological Island</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode#getReportingGroup <em>Reporting Group</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode#getBaseVoltage <em>Base Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode#getTopologicalIsland <em>Topological Island</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode#getSvVoltage <em>Sv Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode#getConnectivityNodeContainer <em>Connectivity Node Container</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTopologicalNode()
 * @model
 * @generated
 */
public interface TopologicalNode extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>PInjection</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PInjection</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PInjection</em>' attribute.
     * @see #isSetPInjection()
     * @see #unsetPInjection()
     * @see #setPInjection(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTopologicalNode_PInjection()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TopologicalNode.pInjection' kind='element'"
     * @generated
     */
    Float getPInjection();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode#getPInjection <em>PInjection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PInjection</em>' attribute.
     * @see #isSetPInjection()
     * @see #unsetPInjection()
     * @see #getPInjection()
     * @generated
     */
    void setPInjection( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode#getPInjection <em>PInjection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPInjection()
     * @see #getPInjection()
     * @see #setPInjection(Float)
     * @generated
     */
    void unsetPInjection();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode#getPInjection <em>PInjection</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>PInjection</em>' attribute is set.
     * @see #unsetPInjection()
     * @see #getPInjection()
     * @see #setPInjection(Float)
     * @generated
     */
    boolean isSetPInjection();

    /**
     * Returns the value of the '<em><b>QInjection</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>QInjection</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>QInjection</em>' attribute.
     * @see #isSetQInjection()
     * @see #unsetQInjection()
     * @see #setQInjection(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTopologicalNode_QInjection()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TopologicalNode.qInjection' kind='element'"
     * @generated
     */
    Float getQInjection();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode#getQInjection <em>QInjection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>QInjection</em>' attribute.
     * @see #isSetQInjection()
     * @see #unsetQInjection()
     * @see #getQInjection()
     * @generated
     */
    void setQInjection( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode#getQInjection <em>QInjection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQInjection()
     * @see #getQInjection()
     * @see #setQInjection(Float)
     * @generated
     */
    void unsetQInjection();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode#getQInjection <em>QInjection</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>QInjection</em>' attribute is set.
     * @see #unsetQInjection()
     * @see #getQInjection()
     * @see #setQInjection(Float)
     * @generated
     */
    boolean isSetQInjection();

    /**
     * Returns the value of the '<em><b>Connectivity Nodes</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectivityNode}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectivityNode#getTopologicalNode <em>Topological Node</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connectivity Nodes</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connectivity Nodes</em>' reference list.
     * @see #isSetConnectivityNodes()
     * @see #unsetConnectivityNodes()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTopologicalNode_ConnectivityNodes()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectivityNode#getTopologicalNode
     * @model opposite="TopologicalNode" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TopologicalNode.ConnectivityNodes' kind='element'"
     * @generated
     */
    EList< ConnectivityNode > getConnectivityNodes();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode#getConnectivityNodes <em>Connectivity Nodes</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConnectivityNodes()
     * @see #getConnectivityNodes()
     * @generated
     */
    void unsetConnectivityNodes();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode#getConnectivityNodes <em>Connectivity Nodes</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Connectivity Nodes</em>' reference list is set.
     * @see #unsetConnectivityNodes()
     * @see #getConnectivityNodes()
     * @generated
     */
    boolean isSetConnectivityNodes();

    /**
     * Returns the value of the '<em><b>Sv Injection</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SvInjection}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SvInjection#getTopologicalNode <em>Topological Node</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sv Injection</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sv Injection</em>' reference list.
     * @see #isSetSvInjection()
     * @see #unsetSvInjection()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTopologicalNode_SvInjection()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SvInjection#getTopologicalNode
     * @model opposite="TopologicalNode" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TopologicalNode.SvInjection' kind='element'"
     * @generated
     */
    EList< SvInjection > getSvInjection();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode#getSvInjection <em>Sv Injection</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSvInjection()
     * @see #getSvInjection()
     * @generated
     */
    void unsetSvInjection();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode#getSvInjection <em>Sv Injection</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sv Injection</em>' reference list is set.
     * @see #unsetSvInjection()
     * @see #getSvInjection()
     * @generated
     */
    boolean isSetSvInjection();

    /**
     * Returns the value of the '<em><b>Bus Name Marker</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BusNameMarker}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BusNameMarker#getTopologicalNode <em>Topological Node</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bus Name Marker</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Bus Name Marker</em>' reference list.
     * @see #isSetBusNameMarker()
     * @see #unsetBusNameMarker()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTopologicalNode_BusNameMarker()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BusNameMarker#getTopologicalNode
     * @model opposite="TopologicalNode" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TopologicalNode.BusNameMarker' kind='element'"
     * @generated
     */
    EList< BusNameMarker > getBusNameMarker();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode#getBusNameMarker <em>Bus Name Marker</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBusNameMarker()
     * @see #getBusNameMarker()
     * @generated
     */
    void unsetBusNameMarker();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode#getBusNameMarker <em>Bus Name Marker</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Bus Name Marker</em>' reference list is set.
     * @see #unsetBusNameMarker()
     * @see #getBusNameMarker()
     * @generated
     */
    boolean isSetBusNameMarker();

    /**
     * Returns the value of the '<em><b>Angle Ref Topological Island</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalIsland#getAngleRefTopologicalNode <em>Angle Ref Topological Node</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Angle Ref Topological Island</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Angle Ref Topological Island</em>' reference.
     * @see #isSetAngleRefTopologicalIsland()
     * @see #unsetAngleRefTopologicalIsland()
     * @see #setAngleRefTopologicalIsland(TopologicalIsland)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTopologicalNode_AngleRefTopologicalIsland()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalIsland#getAngleRefTopologicalNode
     * @model opposite="AngleRefTopologicalNode" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TopologicalNode.AngleRefTopologicalIsland' kind='element'"
     * @generated
     */
    TopologicalIsland getAngleRefTopologicalIsland();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode#getAngleRefTopologicalIsland <em>Angle Ref Topological Island</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Angle Ref Topological Island</em>' reference.
     * @see #isSetAngleRefTopologicalIsland()
     * @see #unsetAngleRefTopologicalIsland()
     * @see #getAngleRefTopologicalIsland()
     * @generated
     */
    void setAngleRefTopologicalIsland( TopologicalIsland value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode#getAngleRefTopologicalIsland <em>Angle Ref Topological Island</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAngleRefTopologicalIsland()
     * @see #getAngleRefTopologicalIsland()
     * @see #setAngleRefTopologicalIsland(TopologicalIsland)
     * @generated
     */
    void unsetAngleRefTopologicalIsland();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode#getAngleRefTopologicalIsland <em>Angle Ref Topological Island</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Angle Ref Topological Island</em>' reference is set.
     * @see #unsetAngleRefTopologicalIsland()
     * @see #getAngleRefTopologicalIsland()
     * @see #setAngleRefTopologicalIsland(TopologicalIsland)
     * @generated
     */
    boolean isSetAngleRefTopologicalIsland();

    /**
     * Returns the value of the '<em><b>Reporting Group</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReportingGroup#getTopologicalNode <em>Topological Node</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reporting Group</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reporting Group</em>' reference.
     * @see #isSetReportingGroup()
     * @see #unsetReportingGroup()
     * @see #setReportingGroup(ReportingGroup)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTopologicalNode_ReportingGroup()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReportingGroup#getTopologicalNode
     * @model opposite="TopologicalNode" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TopologicalNode.ReportingGroup' kind='element'"
     * @generated
     */
    ReportingGroup getReportingGroup();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode#getReportingGroup <em>Reporting Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reporting Group</em>' reference.
     * @see #isSetReportingGroup()
     * @see #unsetReportingGroup()
     * @see #getReportingGroup()
     * @generated
     */
    void setReportingGroup( ReportingGroup value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode#getReportingGroup <em>Reporting Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReportingGroup()
     * @see #getReportingGroup()
     * @see #setReportingGroup(ReportingGroup)
     * @generated
     */
    void unsetReportingGroup();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode#getReportingGroup <em>Reporting Group</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Reporting Group</em>' reference is set.
     * @see #unsetReportingGroup()
     * @see #getReportingGroup()
     * @see #setReportingGroup(ReportingGroup)
     * @generated
     */
    boolean isSetReportingGroup();

    /**
     * Returns the value of the '<em><b>Base Voltage</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BaseVoltage#getTopologicalNode <em>Topological Node</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Base Voltage</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Base Voltage</em>' reference.
     * @see #isSetBaseVoltage()
     * @see #unsetBaseVoltage()
     * @see #setBaseVoltage(BaseVoltage)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTopologicalNode_BaseVoltage()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BaseVoltage#getTopologicalNode
     * @model opposite="TopologicalNode" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TopologicalNode.BaseVoltage' kind='element'"
     * @generated
     */
    BaseVoltage getBaseVoltage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode#getBaseVoltage <em>Base Voltage</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Base Voltage</em>' reference.
     * @see #isSetBaseVoltage()
     * @see #unsetBaseVoltage()
     * @see #getBaseVoltage()
     * @generated
     */
    void setBaseVoltage( BaseVoltage value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode#getBaseVoltage <em>Base Voltage</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBaseVoltage()
     * @see #getBaseVoltage()
     * @see #setBaseVoltage(BaseVoltage)
     * @generated
     */
    void unsetBaseVoltage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode#getBaseVoltage <em>Base Voltage</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Base Voltage</em>' reference is set.
     * @see #unsetBaseVoltage()
     * @see #getBaseVoltage()
     * @see #setBaseVoltage(BaseVoltage)
     * @generated
     */
    boolean isSetBaseVoltage();

    /**
     * Returns the value of the '<em><b>Topological Island</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalIsland#getTopologicalNodes <em>Topological Nodes</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Topological Island</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Topological Island</em>' reference.
     * @see #isSetTopologicalIsland()
     * @see #unsetTopologicalIsland()
     * @see #setTopologicalIsland(TopologicalIsland)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTopologicalNode_TopologicalIsland()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalIsland#getTopologicalNodes
     * @model opposite="TopologicalNodes" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TopologicalNode.TopologicalIsland' kind='element'"
     * @generated
     */
    TopologicalIsland getTopologicalIsland();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode#getTopologicalIsland <em>Topological Island</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Topological Island</em>' reference.
     * @see #isSetTopologicalIsland()
     * @see #unsetTopologicalIsland()
     * @see #getTopologicalIsland()
     * @generated
     */
    void setTopologicalIsland( TopologicalIsland value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode#getTopologicalIsland <em>Topological Island</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTopologicalIsland()
     * @see #getTopologicalIsland()
     * @see #setTopologicalIsland(TopologicalIsland)
     * @generated
     */
    void unsetTopologicalIsland();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode#getTopologicalIsland <em>Topological Island</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Topological Island</em>' reference is set.
     * @see #unsetTopologicalIsland()
     * @see #getTopologicalIsland()
     * @see #setTopologicalIsland(TopologicalIsland)
     * @generated
     */
    boolean isSetTopologicalIsland();

    /**
     * Returns the value of the '<em><b>Sv Voltage</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SvVoltage}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SvVoltage#getTopologicalNode <em>Topological Node</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sv Voltage</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sv Voltage</em>' reference list.
     * @see #isSetSvVoltage()
     * @see #unsetSvVoltage()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTopologicalNode_SvVoltage()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SvVoltage#getTopologicalNode
     * @model opposite="TopologicalNode" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TopologicalNode.SvVoltage' kind='element'"
     * @generated
     */
    EList< SvVoltage > getSvVoltage();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode#getSvVoltage <em>Sv Voltage</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSvVoltage()
     * @see #getSvVoltage()
     * @generated
     */
    void unsetSvVoltage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode#getSvVoltage <em>Sv Voltage</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sv Voltage</em>' reference list is set.
     * @see #unsetSvVoltage()
     * @see #getSvVoltage()
     * @generated
     */
    boolean isSetSvVoltage();

    /**
     * Returns the value of the '<em><b>Terminal</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getTopologicalNode <em>Topological Node</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Terminal</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Terminal</em>' reference list.
     * @see #isSetTerminal()
     * @see #unsetTerminal()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTopologicalNode_Terminal()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getTopologicalNode
     * @model opposite="TopologicalNode" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TopologicalNode.Terminal' kind='element'"
     * @generated
     */
    EList< Terminal > getTerminal();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode#getTerminal <em>Terminal</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTerminal()
     * @see #getTerminal()
     * @generated
     */
    void unsetTerminal();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode#getTerminal <em>Terminal</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Terminal</em>' reference list is set.
     * @see #unsetTerminal()
     * @see #getTerminal()
     * @generated
     */
    boolean isSetTerminal();

    /**
     * Returns the value of the '<em><b>Connectivity Node Container</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectivityNodeContainer#getTopologicalNode <em>Topological Node</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connectivity Node Container</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connectivity Node Container</em>' reference.
     * @see #isSetConnectivityNodeContainer()
     * @see #unsetConnectivityNodeContainer()
     * @see #setConnectivityNodeContainer(ConnectivityNodeContainer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTopologicalNode_ConnectivityNodeContainer()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectivityNodeContainer#getTopologicalNode
     * @model opposite="TopologicalNode" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TopologicalNode.ConnectivityNodeContainer' kind='element'"
     * @generated
     */
    ConnectivityNodeContainer getConnectivityNodeContainer();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode#getConnectivityNodeContainer <em>Connectivity Node Container</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Connectivity Node Container</em>' reference.
     * @see #isSetConnectivityNodeContainer()
     * @see #unsetConnectivityNodeContainer()
     * @see #getConnectivityNodeContainer()
     * @generated
     */
    void setConnectivityNodeContainer( ConnectivityNodeContainer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode#getConnectivityNodeContainer <em>Connectivity Node Container</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConnectivityNodeContainer()
     * @see #getConnectivityNodeContainer()
     * @see #setConnectivityNodeContainer(ConnectivityNodeContainer)
     * @generated
     */
    void unsetConnectivityNodeContainer();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode#getConnectivityNodeContainer <em>Connectivity Node Container</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Connectivity Node Container</em>' reference is set.
     * @see #unsetConnectivityNodeContainer()
     * @see #getConnectivityNodeContainer()
     * @see #setConnectivityNodeContainer(ConnectivityNodeContainer)
     * @generated
     */
    boolean isSetConnectivityNodeContainer();

} // TopologicalNode
