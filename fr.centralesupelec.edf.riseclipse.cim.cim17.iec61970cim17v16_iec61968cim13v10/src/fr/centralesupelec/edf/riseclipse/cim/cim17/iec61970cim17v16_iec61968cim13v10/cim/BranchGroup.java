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
 * A representation of the model object '<em><b>Branch Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BranchGroup#getMaximumActivePower <em>Maximum Active Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BranchGroup#getMaximumReactivePower <em>Maximum Reactive Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BranchGroup#getMinimumActivePower <em>Minimum Active Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BranchGroup#getMinimumReactivePower <em>Minimum Reactive Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BranchGroup#getMonitorActivePower <em>Monitor Active Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BranchGroup#getMonitorReactivePower <em>Monitor Reactive Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BranchGroup#getBranchGroupTerminal <em>Branch Group Terminal</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBranchGroup()
 * @model
 * @generated
 */
public interface BranchGroup extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Maximum Active Power</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Maximum Active Power</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Maximum Active Power</em>' attribute.
     * @see #isSetMaximumActivePower()
     * @see #unsetMaximumActivePower()
     * @see #setMaximumActivePower(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBranchGroup_MaximumActivePower()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='BranchGroup.maximumActivePower' kind='element'"
     * @generated
     */
    Float getMaximumActivePower();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BranchGroup#getMaximumActivePower <em>Maximum Active Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Maximum Active Power</em>' attribute.
     * @see #isSetMaximumActivePower()
     * @see #unsetMaximumActivePower()
     * @see #getMaximumActivePower()
     * @generated
     */
    void setMaximumActivePower( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BranchGroup#getMaximumActivePower <em>Maximum Active Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaximumActivePower()
     * @see #getMaximumActivePower()
     * @see #setMaximumActivePower(Float)
     * @generated
     */
    void unsetMaximumActivePower();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BranchGroup#getMaximumActivePower <em>Maximum Active Power</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Maximum Active Power</em>' attribute is set.
     * @see #unsetMaximumActivePower()
     * @see #getMaximumActivePower()
     * @see #setMaximumActivePower(Float)
     * @generated
     */
    boolean isSetMaximumActivePower();

    /**
     * Returns the value of the '<em><b>Maximum Reactive Power</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Maximum Reactive Power</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Maximum Reactive Power</em>' attribute.
     * @see #isSetMaximumReactivePower()
     * @see #unsetMaximumReactivePower()
     * @see #setMaximumReactivePower(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBranchGroup_MaximumReactivePower()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='BranchGroup.maximumReactivePower' kind='element'"
     * @generated
     */
    Float getMaximumReactivePower();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BranchGroup#getMaximumReactivePower <em>Maximum Reactive Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Maximum Reactive Power</em>' attribute.
     * @see #isSetMaximumReactivePower()
     * @see #unsetMaximumReactivePower()
     * @see #getMaximumReactivePower()
     * @generated
     */
    void setMaximumReactivePower( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BranchGroup#getMaximumReactivePower <em>Maximum Reactive Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaximumReactivePower()
     * @see #getMaximumReactivePower()
     * @see #setMaximumReactivePower(Float)
     * @generated
     */
    void unsetMaximumReactivePower();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BranchGroup#getMaximumReactivePower <em>Maximum Reactive Power</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Maximum Reactive Power</em>' attribute is set.
     * @see #unsetMaximumReactivePower()
     * @see #getMaximumReactivePower()
     * @see #setMaximumReactivePower(Float)
     * @generated
     */
    boolean isSetMaximumReactivePower();

    /**
     * Returns the value of the '<em><b>Minimum Active Power</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Minimum Active Power</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Minimum Active Power</em>' attribute.
     * @see #isSetMinimumActivePower()
     * @see #unsetMinimumActivePower()
     * @see #setMinimumActivePower(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBranchGroup_MinimumActivePower()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='BranchGroup.minimumActivePower' kind='element'"
     * @generated
     */
    Float getMinimumActivePower();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BranchGroup#getMinimumActivePower <em>Minimum Active Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Minimum Active Power</em>' attribute.
     * @see #isSetMinimumActivePower()
     * @see #unsetMinimumActivePower()
     * @see #getMinimumActivePower()
     * @generated
     */
    void setMinimumActivePower( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BranchGroup#getMinimumActivePower <em>Minimum Active Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinimumActivePower()
     * @see #getMinimumActivePower()
     * @see #setMinimumActivePower(Float)
     * @generated
     */
    void unsetMinimumActivePower();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BranchGroup#getMinimumActivePower <em>Minimum Active Power</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Minimum Active Power</em>' attribute is set.
     * @see #unsetMinimumActivePower()
     * @see #getMinimumActivePower()
     * @see #setMinimumActivePower(Float)
     * @generated
     */
    boolean isSetMinimumActivePower();

    /**
     * Returns the value of the '<em><b>Minimum Reactive Power</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Minimum Reactive Power</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Minimum Reactive Power</em>' attribute.
     * @see #isSetMinimumReactivePower()
     * @see #unsetMinimumReactivePower()
     * @see #setMinimumReactivePower(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBranchGroup_MinimumReactivePower()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='BranchGroup.minimumReactivePower' kind='element'"
     * @generated
     */
    Float getMinimumReactivePower();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BranchGroup#getMinimumReactivePower <em>Minimum Reactive Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Minimum Reactive Power</em>' attribute.
     * @see #isSetMinimumReactivePower()
     * @see #unsetMinimumReactivePower()
     * @see #getMinimumReactivePower()
     * @generated
     */
    void setMinimumReactivePower( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BranchGroup#getMinimumReactivePower <em>Minimum Reactive Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinimumReactivePower()
     * @see #getMinimumReactivePower()
     * @see #setMinimumReactivePower(Float)
     * @generated
     */
    void unsetMinimumReactivePower();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BranchGroup#getMinimumReactivePower <em>Minimum Reactive Power</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Minimum Reactive Power</em>' attribute is set.
     * @see #unsetMinimumReactivePower()
     * @see #getMinimumReactivePower()
     * @see #setMinimumReactivePower(Float)
     * @generated
     */
    boolean isSetMinimumReactivePower();

    /**
     * Returns the value of the '<em><b>Monitor Active Power</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Monitor Active Power</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Monitor Active Power</em>' attribute.
     * @see #isSetMonitorActivePower()
     * @see #unsetMonitorActivePower()
     * @see #setMonitorActivePower(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBranchGroup_MonitorActivePower()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='BranchGroup.monitorActivePower' kind='element'"
     * @generated
     */
    Boolean getMonitorActivePower();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BranchGroup#getMonitorActivePower <em>Monitor Active Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Monitor Active Power</em>' attribute.
     * @see #isSetMonitorActivePower()
     * @see #unsetMonitorActivePower()
     * @see #getMonitorActivePower()
     * @generated
     */
    void setMonitorActivePower( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BranchGroup#getMonitorActivePower <em>Monitor Active Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMonitorActivePower()
     * @see #getMonitorActivePower()
     * @see #setMonitorActivePower(Boolean)
     * @generated
     */
    void unsetMonitorActivePower();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BranchGroup#getMonitorActivePower <em>Monitor Active Power</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Monitor Active Power</em>' attribute is set.
     * @see #unsetMonitorActivePower()
     * @see #getMonitorActivePower()
     * @see #setMonitorActivePower(Boolean)
     * @generated
     */
    boolean isSetMonitorActivePower();

    /**
     * Returns the value of the '<em><b>Monitor Reactive Power</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Monitor Reactive Power</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Monitor Reactive Power</em>' attribute.
     * @see #isSetMonitorReactivePower()
     * @see #unsetMonitorReactivePower()
     * @see #setMonitorReactivePower(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBranchGroup_MonitorReactivePower()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='BranchGroup.monitorReactivePower' kind='element'"
     * @generated
     */
    Boolean getMonitorReactivePower();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BranchGroup#getMonitorReactivePower <em>Monitor Reactive Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Monitor Reactive Power</em>' attribute.
     * @see #isSetMonitorReactivePower()
     * @see #unsetMonitorReactivePower()
     * @see #getMonitorReactivePower()
     * @generated
     */
    void setMonitorReactivePower( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BranchGroup#getMonitorReactivePower <em>Monitor Reactive Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMonitorReactivePower()
     * @see #getMonitorReactivePower()
     * @see #setMonitorReactivePower(Boolean)
     * @generated
     */
    void unsetMonitorReactivePower();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BranchGroup#getMonitorReactivePower <em>Monitor Reactive Power</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Monitor Reactive Power</em>' attribute is set.
     * @see #unsetMonitorReactivePower()
     * @see #getMonitorReactivePower()
     * @see #setMonitorReactivePower(Boolean)
     * @generated
     */
    boolean isSetMonitorReactivePower();

    /**
     * Returns the value of the '<em><b>Branch Group Terminal</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BranchGroupTerminal}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BranchGroupTerminal#getBranchGroup <em>Branch Group</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Branch Group Terminal</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Branch Group Terminal</em>' reference list.
     * @see #isSetBranchGroupTerminal()
     * @see #unsetBranchGroupTerminal()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBranchGroup_BranchGroupTerminal()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BranchGroupTerminal#getBranchGroup
     * @model opposite="BranchGroup" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='BranchGroup.BranchGroupTerminal' kind='element'"
     * @generated
     */
    EList< BranchGroupTerminal > getBranchGroupTerminal();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BranchGroup#getBranchGroupTerminal <em>Branch Group Terminal</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBranchGroupTerminal()
     * @see #getBranchGroupTerminal()
     * @generated
     */
    void unsetBranchGroupTerminal();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BranchGroup#getBranchGroupTerminal <em>Branch Group Terminal</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Branch Group Terminal</em>' reference list is set.
     * @see #unsetBranchGroupTerminal()
     * @see #getBranchGroupTerminal()
     * @generated
     */
    boolean isSetBranchGroupTerminal();

} // BranchGroup
