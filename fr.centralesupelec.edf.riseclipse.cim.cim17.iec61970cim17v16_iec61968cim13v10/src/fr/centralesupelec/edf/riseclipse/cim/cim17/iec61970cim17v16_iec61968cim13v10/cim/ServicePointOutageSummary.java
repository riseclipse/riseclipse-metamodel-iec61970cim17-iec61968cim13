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
 * A representation of the model object '<em><b>Service Point Outage Summary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ServicePointOutageSummary#getCriticalCount <em>Critical Count</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ServicePointOutageSummary#getTotalCount <em>Total Count</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getServicePointOutageSummary()
 * @model
 * @generated
 */
public interface ServicePointOutageSummary extends EObject {
    /**
     * Returns the value of the '<em><b>Critical Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Critical Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Critical Count</em>' attribute.
     * @see #isSetCriticalCount()
     * @see #unsetCriticalCount()
     * @see #setCriticalCount(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getServicePointOutageSummary_CriticalCount()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ServicePointOutageSummary.criticalCount' kind='element'"
     * @generated
     */
    Integer getCriticalCount();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ServicePointOutageSummary#getCriticalCount <em>Critical Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Critical Count</em>' attribute.
     * @see #isSetCriticalCount()
     * @see #unsetCriticalCount()
     * @see #getCriticalCount()
     * @generated
     */
    void setCriticalCount( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ServicePointOutageSummary#getCriticalCount <em>Critical Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCriticalCount()
     * @see #getCriticalCount()
     * @see #setCriticalCount(Integer)
     * @generated
     */
    void unsetCriticalCount();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ServicePointOutageSummary#getCriticalCount <em>Critical Count</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Critical Count</em>' attribute is set.
     * @see #unsetCriticalCount()
     * @see #getCriticalCount()
     * @see #setCriticalCount(Integer)
     * @generated
     */
    boolean isSetCriticalCount();

    /**
     * Returns the value of the '<em><b>Total Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Total Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Total Count</em>' attribute.
     * @see #isSetTotalCount()
     * @see #unsetTotalCount()
     * @see #setTotalCount(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getServicePointOutageSummary_TotalCount()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ServicePointOutageSummary.totalCount' kind='element'"
     * @generated
     */
    Integer getTotalCount();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ServicePointOutageSummary#getTotalCount <em>Total Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Total Count</em>' attribute.
     * @see #isSetTotalCount()
     * @see #unsetTotalCount()
     * @see #getTotalCount()
     * @generated
     */
    void setTotalCount( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ServicePointOutageSummary#getTotalCount <em>Total Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTotalCount()
     * @see #getTotalCount()
     * @see #setTotalCount(Integer)
     * @generated
     */
    void unsetTotalCount();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ServicePointOutageSummary#getTotalCount <em>Total Count</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Total Count</em>' attribute is set.
     * @see #unsetTotalCount()
     * @see #getTotalCount()
     * @see #setTotalCount(Integer)
     * @generated
     */
    boolean isSetTotalCount();

} // ServicePointOutageSummary
