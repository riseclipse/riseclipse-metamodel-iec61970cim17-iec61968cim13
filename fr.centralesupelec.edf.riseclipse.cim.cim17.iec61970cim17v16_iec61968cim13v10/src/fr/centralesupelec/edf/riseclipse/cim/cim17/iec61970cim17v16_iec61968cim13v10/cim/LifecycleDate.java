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

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lifecycle Date</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LifecycleDate#getInstallationDate <em>Installation Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LifecycleDate#getManufacturedDate <em>Manufactured Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LifecycleDate#getPurchaseDate <em>Purchase Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LifecycleDate#getReceivedDate <em>Received Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LifecycleDate#getRemovalDate <em>Removal Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LifecycleDate#getRetiredDate <em>Retired Date</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLifecycleDate()
 * @model
 * @generated
 */
public interface LifecycleDate extends EObject {
    /**
     * Returns the value of the '<em><b>Installation Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Installation Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Installation Date</em>' attribute.
     * @see #isSetInstallationDate()
     * @see #unsetInstallationDate()
     * @see #setInstallationDate(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLifecycleDate_InstallationDate()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LifecycleDate.installationDate' kind='element'"
     * @generated
     */
    Date getInstallationDate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LifecycleDate#getInstallationDate <em>Installation Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Installation Date</em>' attribute.
     * @see #isSetInstallationDate()
     * @see #unsetInstallationDate()
     * @see #getInstallationDate()
     * @generated
     */
    void setInstallationDate( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LifecycleDate#getInstallationDate <em>Installation Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInstallationDate()
     * @see #getInstallationDate()
     * @see #setInstallationDate(Date)
     * @generated
     */
    void unsetInstallationDate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LifecycleDate#getInstallationDate <em>Installation Date</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Installation Date</em>' attribute is set.
     * @see #unsetInstallationDate()
     * @see #getInstallationDate()
     * @see #setInstallationDate(Date)
     * @generated
     */
    boolean isSetInstallationDate();

    /**
     * Returns the value of the '<em><b>Manufactured Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Manufactured Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Manufactured Date</em>' attribute.
     * @see #isSetManufacturedDate()
     * @see #unsetManufacturedDate()
     * @see #setManufacturedDate(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLifecycleDate_ManufacturedDate()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LifecycleDate.manufacturedDate' kind='element'"
     * @generated
     */
    Date getManufacturedDate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LifecycleDate#getManufacturedDate <em>Manufactured Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Manufactured Date</em>' attribute.
     * @see #isSetManufacturedDate()
     * @see #unsetManufacturedDate()
     * @see #getManufacturedDate()
     * @generated
     */
    void setManufacturedDate( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LifecycleDate#getManufacturedDate <em>Manufactured Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetManufacturedDate()
     * @see #getManufacturedDate()
     * @see #setManufacturedDate(Date)
     * @generated
     */
    void unsetManufacturedDate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LifecycleDate#getManufacturedDate <em>Manufactured Date</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Manufactured Date</em>' attribute is set.
     * @see #unsetManufacturedDate()
     * @see #getManufacturedDate()
     * @see #setManufacturedDate(Date)
     * @generated
     */
    boolean isSetManufacturedDate();

    /**
     * Returns the value of the '<em><b>Purchase Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Purchase Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Purchase Date</em>' attribute.
     * @see #isSetPurchaseDate()
     * @see #unsetPurchaseDate()
     * @see #setPurchaseDate(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLifecycleDate_PurchaseDate()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LifecycleDate.purchaseDate' kind='element'"
     * @generated
     */
    Date getPurchaseDate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LifecycleDate#getPurchaseDate <em>Purchase Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Purchase Date</em>' attribute.
     * @see #isSetPurchaseDate()
     * @see #unsetPurchaseDate()
     * @see #getPurchaseDate()
     * @generated
     */
    void setPurchaseDate( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LifecycleDate#getPurchaseDate <em>Purchase Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPurchaseDate()
     * @see #getPurchaseDate()
     * @see #setPurchaseDate(Date)
     * @generated
     */
    void unsetPurchaseDate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LifecycleDate#getPurchaseDate <em>Purchase Date</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Purchase Date</em>' attribute is set.
     * @see #unsetPurchaseDate()
     * @see #getPurchaseDate()
     * @see #setPurchaseDate(Date)
     * @generated
     */
    boolean isSetPurchaseDate();

    /**
     * Returns the value of the '<em><b>Received Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Received Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Received Date</em>' attribute.
     * @see #isSetReceivedDate()
     * @see #unsetReceivedDate()
     * @see #setReceivedDate(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLifecycleDate_ReceivedDate()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LifecycleDate.receivedDate' kind='element'"
     * @generated
     */
    Date getReceivedDate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LifecycleDate#getReceivedDate <em>Received Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Received Date</em>' attribute.
     * @see #isSetReceivedDate()
     * @see #unsetReceivedDate()
     * @see #getReceivedDate()
     * @generated
     */
    void setReceivedDate( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LifecycleDate#getReceivedDate <em>Received Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReceivedDate()
     * @see #getReceivedDate()
     * @see #setReceivedDate(Date)
     * @generated
     */
    void unsetReceivedDate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LifecycleDate#getReceivedDate <em>Received Date</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Received Date</em>' attribute is set.
     * @see #unsetReceivedDate()
     * @see #getReceivedDate()
     * @see #setReceivedDate(Date)
     * @generated
     */
    boolean isSetReceivedDate();

    /**
     * Returns the value of the '<em><b>Removal Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Removal Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Removal Date</em>' attribute.
     * @see #isSetRemovalDate()
     * @see #unsetRemovalDate()
     * @see #setRemovalDate(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLifecycleDate_RemovalDate()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LifecycleDate.removalDate' kind='element'"
     * @generated
     */
    Date getRemovalDate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LifecycleDate#getRemovalDate <em>Removal Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Removal Date</em>' attribute.
     * @see #isSetRemovalDate()
     * @see #unsetRemovalDate()
     * @see #getRemovalDate()
     * @generated
     */
    void setRemovalDate( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LifecycleDate#getRemovalDate <em>Removal Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRemovalDate()
     * @see #getRemovalDate()
     * @see #setRemovalDate(Date)
     * @generated
     */
    void unsetRemovalDate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LifecycleDate#getRemovalDate <em>Removal Date</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Removal Date</em>' attribute is set.
     * @see #unsetRemovalDate()
     * @see #getRemovalDate()
     * @see #setRemovalDate(Date)
     * @generated
     */
    boolean isSetRemovalDate();

    /**
     * Returns the value of the '<em><b>Retired Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Retired Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Retired Date</em>' attribute.
     * @see #isSetRetiredDate()
     * @see #unsetRetiredDate()
     * @see #setRetiredDate(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getLifecycleDate_RetiredDate()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='LifecycleDate.retiredDate' kind='element'"
     * @generated
     */
    Date getRetiredDate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LifecycleDate#getRetiredDate <em>Retired Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Retired Date</em>' attribute.
     * @see #isSetRetiredDate()
     * @see #unsetRetiredDate()
     * @see #getRetiredDate()
     * @generated
     */
    void setRetiredDate( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LifecycleDate#getRetiredDate <em>Retired Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRetiredDate()
     * @see #getRetiredDate()
     * @see #setRetiredDate(Date)
     * @generated
     */
    void unsetRetiredDate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LifecycleDate#getRetiredDate <em>Retired Date</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Retired Date</em>' attribute is set.
     * @see #unsetRetiredDate()
     * @see #getRetiredDate()
     * @see #setRetiredDate(Date)
     * @generated
     */
    boolean isSetRetiredDate();

} // LifecycleDate
