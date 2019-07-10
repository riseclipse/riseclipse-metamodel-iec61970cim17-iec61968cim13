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
 * A representation of the model object '<em><b>Repair Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RepairItem#getBreakerRepairItem <em>Breaker Repair Item</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RepairItem#getTransformerRepairItem <em>Transformer Repair Item</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RepairItem#getRepairWorkTask <em>Repair Work Task</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRepairItem()
 * @model
 * @generated
 */
public interface RepairItem extends CimObjectWithID {
    /**
     * Returns the value of the '<em><b>Breaker Repair Item</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BreakerRepairItemKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Breaker Repair Item</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Breaker Repair Item</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BreakerRepairItemKind
     * @see #isSetBreakerRepairItem()
     * @see #unsetBreakerRepairItem()
     * @see #setBreakerRepairItem(BreakerRepairItemKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRepairItem_BreakerRepairItem()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RepairItem.breakerRepairItem' kind='element'"
     * @generated
     */
    BreakerRepairItemKind getBreakerRepairItem();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RepairItem#getBreakerRepairItem <em>Breaker Repair Item</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Breaker Repair Item</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BreakerRepairItemKind
     * @see #isSetBreakerRepairItem()
     * @see #unsetBreakerRepairItem()
     * @see #getBreakerRepairItem()
     * @generated
     */
    void setBreakerRepairItem( BreakerRepairItemKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RepairItem#getBreakerRepairItem <em>Breaker Repair Item</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBreakerRepairItem()
     * @see #getBreakerRepairItem()
     * @see #setBreakerRepairItem(BreakerRepairItemKind)
     * @generated
     */
    void unsetBreakerRepairItem();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RepairItem#getBreakerRepairItem <em>Breaker Repair Item</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Breaker Repair Item</em>' attribute is set.
     * @see #unsetBreakerRepairItem()
     * @see #getBreakerRepairItem()
     * @see #setBreakerRepairItem(BreakerRepairItemKind)
     * @generated
     */
    boolean isSetBreakerRepairItem();

    /**
     * Returns the value of the '<em><b>Transformer Repair Item</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerRepairItemKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Transformer Repair Item</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Transformer Repair Item</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerRepairItemKind
     * @see #isSetTransformerRepairItem()
     * @see #unsetTransformerRepairItem()
     * @see #setTransformerRepairItem(TransformerRepairItemKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRepairItem_TransformerRepairItem()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RepairItem.transformerRepairItem' kind='element'"
     * @generated
     */
    TransformerRepairItemKind getTransformerRepairItem();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RepairItem#getTransformerRepairItem <em>Transformer Repair Item</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transformer Repair Item</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerRepairItemKind
     * @see #isSetTransformerRepairItem()
     * @see #unsetTransformerRepairItem()
     * @see #getTransformerRepairItem()
     * @generated
     */
    void setTransformerRepairItem( TransformerRepairItemKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RepairItem#getTransformerRepairItem <em>Transformer Repair Item</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTransformerRepairItem()
     * @see #getTransformerRepairItem()
     * @see #setTransformerRepairItem(TransformerRepairItemKind)
     * @generated
     */
    void unsetTransformerRepairItem();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RepairItem#getTransformerRepairItem <em>Transformer Repair Item</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Transformer Repair Item</em>' attribute is set.
     * @see #unsetTransformerRepairItem()
     * @see #getTransformerRepairItem()
     * @see #setTransformerRepairItem(TransformerRepairItemKind)
     * @generated
     */
    boolean isSetTransformerRepairItem();

    /**
     * Returns the value of the '<em><b>Repair Work Task</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RepairWorkTask}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RepairWorkTask#getBreakerRepairItem <em>Breaker Repair Item</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Repair Work Task</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Repair Work Task</em>' reference list.
     * @see #isSetRepairWorkTask()
     * @see #unsetRepairWorkTask()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRepairItem_RepairWorkTask()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RepairWorkTask#getBreakerRepairItem
     * @model opposite="BreakerRepairItem" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RepairItem.RepairWorkTask' kind='element'"
     * @generated
     */
    EList< RepairWorkTask > getRepairWorkTask();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RepairItem#getRepairWorkTask <em>Repair Work Task</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRepairWorkTask()
     * @see #getRepairWorkTask()
     * @generated
     */
    void unsetRepairWorkTask();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RepairItem#getRepairWorkTask <em>Repair Work Task</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Repair Work Task</em>' reference list is set.
     * @see #unsetRepairWorkTask()
     * @see #getRepairWorkTask()
     * @generated
     */
    boolean isSetRepairWorkTask();

} // RepairItem
