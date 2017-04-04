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
 * A representation of the model object '<em><b>Target Level Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TargetLevelSchedule#getHighLevelLimit <em>High Level Limit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TargetLevelSchedule#getLowLevelLimit <em>Low Level Limit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TargetLevelSchedule#getReservoir <em>Reservoir</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTargetLevelSchedule()
 * @model
 * @generated
 */
public interface TargetLevelSchedule extends Curve {
    /**
     * Returns the value of the '<em><b>High Level Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>High Level Limit</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>High Level Limit</em>' attribute.
     * @see #isSetHighLevelLimit()
     * @see #unsetHighLevelLimit()
     * @see #setHighLevelLimit(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTargetLevelSchedule_HighLevelLimit()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TargetLevelSchedule.highLevelLimit' kind='element'"
     * @generated
     */
    Float getHighLevelLimit();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TargetLevelSchedule#getHighLevelLimit <em>High Level Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>High Level Limit</em>' attribute.
     * @see #isSetHighLevelLimit()
     * @see #unsetHighLevelLimit()
     * @see #getHighLevelLimit()
     * @generated
     */
    void setHighLevelLimit( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TargetLevelSchedule#getHighLevelLimit <em>High Level Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHighLevelLimit()
     * @see #getHighLevelLimit()
     * @see #setHighLevelLimit(Float)
     * @generated
     */
    void unsetHighLevelLimit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TargetLevelSchedule#getHighLevelLimit <em>High Level Limit</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>High Level Limit</em>' attribute is set.
     * @see #unsetHighLevelLimit()
     * @see #getHighLevelLimit()
     * @see #setHighLevelLimit(Float)
     * @generated
     */
    boolean isSetHighLevelLimit();

    /**
     * Returns the value of the '<em><b>Low Level Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Low Level Limit</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Low Level Limit</em>' attribute.
     * @see #isSetLowLevelLimit()
     * @see #unsetLowLevelLimit()
     * @see #setLowLevelLimit(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTargetLevelSchedule_LowLevelLimit()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TargetLevelSchedule.lowLevelLimit' kind='element'"
     * @generated
     */
    Float getLowLevelLimit();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TargetLevelSchedule#getLowLevelLimit <em>Low Level Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Low Level Limit</em>' attribute.
     * @see #isSetLowLevelLimit()
     * @see #unsetLowLevelLimit()
     * @see #getLowLevelLimit()
     * @generated
     */
    void setLowLevelLimit( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TargetLevelSchedule#getLowLevelLimit <em>Low Level Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLowLevelLimit()
     * @see #getLowLevelLimit()
     * @see #setLowLevelLimit(Float)
     * @generated
     */
    void unsetLowLevelLimit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TargetLevelSchedule#getLowLevelLimit <em>Low Level Limit</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Low Level Limit</em>' attribute is set.
     * @see #unsetLowLevelLimit()
     * @see #getLowLevelLimit()
     * @see #setLowLevelLimit(Float)
     * @generated
     */
    boolean isSetLowLevelLimit();

    /**
     * Returns the value of the '<em><b>Reservoir</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getTargetLevelSchedule <em>Target Level Schedule</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reservoir</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reservoir</em>' reference.
     * @see #isSetReservoir()
     * @see #unsetReservoir()
     * @see #setReservoir(Reservoir)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTargetLevelSchedule_Reservoir()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getTargetLevelSchedule
     * @model opposite="TargetLevelSchedule" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TargetLevelSchedule.Reservoir' kind='element'"
     * @generated
     */
    Reservoir getReservoir();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TargetLevelSchedule#getReservoir <em>Reservoir</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reservoir</em>' reference.
     * @see #isSetReservoir()
     * @see #unsetReservoir()
     * @see #getReservoir()
     * @generated
     */
    void setReservoir( Reservoir value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TargetLevelSchedule#getReservoir <em>Reservoir</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReservoir()
     * @see #getReservoir()
     * @see #setReservoir(Reservoir)
     * @generated
     */
    void unsetReservoir();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TargetLevelSchedule#getReservoir <em>Reservoir</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Reservoir</em>' reference is set.
     * @see #unsetReservoir()
     * @see #getReservoir()
     * @see #setReservoir(Reservoir)
     * @generated
     */
    boolean isSetReservoir();

} // TargetLevelSchedule
