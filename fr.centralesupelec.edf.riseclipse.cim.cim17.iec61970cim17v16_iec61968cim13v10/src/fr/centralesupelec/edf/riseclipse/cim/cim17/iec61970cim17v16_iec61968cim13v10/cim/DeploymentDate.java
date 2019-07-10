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
 * A representation of the model object '<em><b>Deployment Date</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DeploymentDate#getInServiceDate <em>In Service Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DeploymentDate#getInstalledDate <em>Installed Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DeploymentDate#getNotYetInstalledDate <em>Not Yet Installed Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DeploymentDate#getOutOfServiceDate <em>Out Of Service Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DeploymentDate#getRemovedDate <em>Removed Date</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDeploymentDate()
 * @model
 * @generated
 */
public interface DeploymentDate extends EObject {
    /**
     * Returns the value of the '<em><b>In Service Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>In Service Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>In Service Date</em>' attribute.
     * @see #isSetInServiceDate()
     * @see #unsetInServiceDate()
     * @see #setInServiceDate(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDeploymentDate_InServiceDate()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DeploymentDate.inServiceDate' kind='element'"
     * @generated
     */
    Date getInServiceDate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DeploymentDate#getInServiceDate <em>In Service Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>In Service Date</em>' attribute.
     * @see #isSetInServiceDate()
     * @see #unsetInServiceDate()
     * @see #getInServiceDate()
     * @generated
     */
    void setInServiceDate( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DeploymentDate#getInServiceDate <em>In Service Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInServiceDate()
     * @see #getInServiceDate()
     * @see #setInServiceDate(Date)
     * @generated
     */
    void unsetInServiceDate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DeploymentDate#getInServiceDate <em>In Service Date</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>In Service Date</em>' attribute is set.
     * @see #unsetInServiceDate()
     * @see #getInServiceDate()
     * @see #setInServiceDate(Date)
     * @generated
     */
    boolean isSetInServiceDate();

    /**
     * Returns the value of the '<em><b>Installed Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Installed Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Installed Date</em>' attribute.
     * @see #isSetInstalledDate()
     * @see #unsetInstalledDate()
     * @see #setInstalledDate(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDeploymentDate_InstalledDate()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DeploymentDate.installedDate' kind='element'"
     * @generated
     */
    Date getInstalledDate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DeploymentDate#getInstalledDate <em>Installed Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Installed Date</em>' attribute.
     * @see #isSetInstalledDate()
     * @see #unsetInstalledDate()
     * @see #getInstalledDate()
     * @generated
     */
    void setInstalledDate( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DeploymentDate#getInstalledDate <em>Installed Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInstalledDate()
     * @see #getInstalledDate()
     * @see #setInstalledDate(Date)
     * @generated
     */
    void unsetInstalledDate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DeploymentDate#getInstalledDate <em>Installed Date</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Installed Date</em>' attribute is set.
     * @see #unsetInstalledDate()
     * @see #getInstalledDate()
     * @see #setInstalledDate(Date)
     * @generated
     */
    boolean isSetInstalledDate();

    /**
     * Returns the value of the '<em><b>Not Yet Installed Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Not Yet Installed Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Not Yet Installed Date</em>' attribute.
     * @see #isSetNotYetInstalledDate()
     * @see #unsetNotYetInstalledDate()
     * @see #setNotYetInstalledDate(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDeploymentDate_NotYetInstalledDate()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DeploymentDate.notYetInstalledDate' kind='element'"
     * @generated
     */
    Date getNotYetInstalledDate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DeploymentDate#getNotYetInstalledDate <em>Not Yet Installed Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Not Yet Installed Date</em>' attribute.
     * @see #isSetNotYetInstalledDate()
     * @see #unsetNotYetInstalledDate()
     * @see #getNotYetInstalledDate()
     * @generated
     */
    void setNotYetInstalledDate( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DeploymentDate#getNotYetInstalledDate <em>Not Yet Installed Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNotYetInstalledDate()
     * @see #getNotYetInstalledDate()
     * @see #setNotYetInstalledDate(Date)
     * @generated
     */
    void unsetNotYetInstalledDate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DeploymentDate#getNotYetInstalledDate <em>Not Yet Installed Date</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Not Yet Installed Date</em>' attribute is set.
     * @see #unsetNotYetInstalledDate()
     * @see #getNotYetInstalledDate()
     * @see #setNotYetInstalledDate(Date)
     * @generated
     */
    boolean isSetNotYetInstalledDate();

    /**
     * Returns the value of the '<em><b>Out Of Service Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Out Of Service Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Out Of Service Date</em>' attribute.
     * @see #isSetOutOfServiceDate()
     * @see #unsetOutOfServiceDate()
     * @see #setOutOfServiceDate(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDeploymentDate_OutOfServiceDate()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DeploymentDate.outOfServiceDate' kind='element'"
     * @generated
     */
    Date getOutOfServiceDate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DeploymentDate#getOutOfServiceDate <em>Out Of Service Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Out Of Service Date</em>' attribute.
     * @see #isSetOutOfServiceDate()
     * @see #unsetOutOfServiceDate()
     * @see #getOutOfServiceDate()
     * @generated
     */
    void setOutOfServiceDate( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DeploymentDate#getOutOfServiceDate <em>Out Of Service Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOutOfServiceDate()
     * @see #getOutOfServiceDate()
     * @see #setOutOfServiceDate(Date)
     * @generated
     */
    void unsetOutOfServiceDate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DeploymentDate#getOutOfServiceDate <em>Out Of Service Date</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Out Of Service Date</em>' attribute is set.
     * @see #unsetOutOfServiceDate()
     * @see #getOutOfServiceDate()
     * @see #setOutOfServiceDate(Date)
     * @generated
     */
    boolean isSetOutOfServiceDate();

    /**
     * Returns the value of the '<em><b>Removed Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Removed Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Removed Date</em>' attribute.
     * @see #isSetRemovedDate()
     * @see #unsetRemovedDate()
     * @see #setRemovedDate(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDeploymentDate_RemovedDate()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DeploymentDate.removedDate' kind='element'"
     * @generated
     */
    Date getRemovedDate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DeploymentDate#getRemovedDate <em>Removed Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Removed Date</em>' attribute.
     * @see #isSetRemovedDate()
     * @see #unsetRemovedDate()
     * @see #getRemovedDate()
     * @generated
     */
    void setRemovedDate( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DeploymentDate#getRemovedDate <em>Removed Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRemovedDate()
     * @see #getRemovedDate()
     * @see #setRemovedDate(Date)
     * @generated
     */
    void unsetRemovedDate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DeploymentDate#getRemovedDate <em>Removed Date</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Removed Date</em>' attribute is set.
     * @see #unsetRemovedDate()
     * @see #getRemovedDate()
     * @see #setRemovedDate(Date)
     * @generated
     */
    boolean isSetRemovedDate();

} // DeploymentDate
