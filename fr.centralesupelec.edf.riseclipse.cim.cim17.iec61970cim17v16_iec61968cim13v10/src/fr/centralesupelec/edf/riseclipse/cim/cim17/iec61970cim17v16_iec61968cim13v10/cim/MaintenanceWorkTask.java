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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Maintenance Work Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MaintenanceWorkTask#getBreakerMaintenanceKind <em>Breaker Maintenance Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MaintenanceWorkTask#getTransformerMaintenanceKind <em>Transformer Maintenance Kind</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getMaintenanceWorkTask()
 * @model
 * @generated
 */
public interface MaintenanceWorkTask extends WorkTask {
    /**
     * Returns the value of the '<em><b>Breaker Maintenance Kind</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BreakerMaintenanceKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Breaker Maintenance Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Breaker Maintenance Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BreakerMaintenanceKind
     * @see #isSetBreakerMaintenanceKind()
     * @see #unsetBreakerMaintenanceKind()
     * @see #setBreakerMaintenanceKind(BreakerMaintenanceKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getMaintenanceWorkTask_BreakerMaintenanceKind()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='MaintenanceWorkTask.breakerMaintenanceKind' kind='element'"
     * @generated
     */
    BreakerMaintenanceKind getBreakerMaintenanceKind();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MaintenanceWorkTask#getBreakerMaintenanceKind <em>Breaker Maintenance Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Breaker Maintenance Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BreakerMaintenanceKind
     * @see #isSetBreakerMaintenanceKind()
     * @see #unsetBreakerMaintenanceKind()
     * @see #getBreakerMaintenanceKind()
     * @generated
     */
    void setBreakerMaintenanceKind( BreakerMaintenanceKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MaintenanceWorkTask#getBreakerMaintenanceKind <em>Breaker Maintenance Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBreakerMaintenanceKind()
     * @see #getBreakerMaintenanceKind()
     * @see #setBreakerMaintenanceKind(BreakerMaintenanceKind)
     * @generated
     */
    void unsetBreakerMaintenanceKind();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MaintenanceWorkTask#getBreakerMaintenanceKind <em>Breaker Maintenance Kind</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Breaker Maintenance Kind</em>' attribute is set.
     * @see #unsetBreakerMaintenanceKind()
     * @see #getBreakerMaintenanceKind()
     * @see #setBreakerMaintenanceKind(BreakerMaintenanceKind)
     * @generated
     */
    boolean isSetBreakerMaintenanceKind();

    /**
     * Returns the value of the '<em><b>Transformer Maintenance Kind</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerMaintenanceKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Transformer Maintenance Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Transformer Maintenance Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerMaintenanceKind
     * @see #isSetTransformerMaintenanceKind()
     * @see #unsetTransformerMaintenanceKind()
     * @see #setTransformerMaintenanceKind(TransformerMaintenanceKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getMaintenanceWorkTask_TransformerMaintenanceKind()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='MaintenanceWorkTask.transformerMaintenanceKind' kind='element'"
     * @generated
     */
    TransformerMaintenanceKind getTransformerMaintenanceKind();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MaintenanceWorkTask#getTransformerMaintenanceKind <em>Transformer Maintenance Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transformer Maintenance Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerMaintenanceKind
     * @see #isSetTransformerMaintenanceKind()
     * @see #unsetTransformerMaintenanceKind()
     * @see #getTransformerMaintenanceKind()
     * @generated
     */
    void setTransformerMaintenanceKind( TransformerMaintenanceKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MaintenanceWorkTask#getTransformerMaintenanceKind <em>Transformer Maintenance Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTransformerMaintenanceKind()
     * @see #getTransformerMaintenanceKind()
     * @see #setTransformerMaintenanceKind(TransformerMaintenanceKind)
     * @generated
     */
    void unsetTransformerMaintenanceKind();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MaintenanceWorkTask#getTransformerMaintenanceKind <em>Transformer Maintenance Kind</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Transformer Maintenance Kind</em>' attribute is set.
     * @see #unsetTransformerMaintenanceKind()
     * @see #getTransformerMaintenanceKind()
     * @see #setTransformerMaintenanceKind(TransformerMaintenanceKind)
     * @generated
     */
    boolean isSetTransformerMaintenanceKind();

} // MaintenanceWorkTask
