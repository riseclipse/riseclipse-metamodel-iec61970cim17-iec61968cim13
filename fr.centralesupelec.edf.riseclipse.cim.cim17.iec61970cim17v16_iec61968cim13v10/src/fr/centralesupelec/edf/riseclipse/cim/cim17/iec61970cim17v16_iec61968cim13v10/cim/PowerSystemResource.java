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
 * A representation of the model object '<em><b>Power System Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource#getControls <em>Controls</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource#getAssetDatasheet <em>Asset Datasheet</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource#getReportingGroup <em>Reporting Group</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource#getAssets <em>Assets</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource#getOperationalTags <em>Operational Tags</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource#getOperatingShare <em>Operating Share</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource#getClearances <em>Clearances</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource#getLocation <em>Location</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource#getPSRType <em>PSR Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource#getMeasurements <em>Measurements</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource#getPSREvents <em>PSR Events</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPowerSystemResource()
 * @model
 * @generated
 */
public interface PowerSystemResource extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Controls</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Control}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Control#getPowerSystemResource <em>Power System Resource</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Controls</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Controls</em>' reference list.
     * @see #isSetControls()
     * @see #unsetControls()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPowerSystemResource_Controls()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Control#getPowerSystemResource
     * @model opposite="PowerSystemResource" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PowerSystemResource.Controls' kind='element'"
     * @generated
     */
    EList< Control > getControls();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource#getControls <em>Controls</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetControls()
     * @see #getControls()
     * @generated
     */
    void unsetControls();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource#getControls <em>Controls</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Controls</em>' reference list is set.
     * @see #unsetControls()
     * @see #getControls()
     * @generated
     */
    boolean isSetControls();

    /**
     * Returns the value of the '<em><b>Asset Datasheet</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetInfo#getPowerSystemResources <em>Power System Resources</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Asset Datasheet</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Asset Datasheet</em>' reference.
     * @see #isSetAssetDatasheet()
     * @see #unsetAssetDatasheet()
     * @see #setAssetDatasheet(AssetInfo)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPowerSystemResource_AssetDatasheet()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetInfo#getPowerSystemResources
     * @model opposite="PowerSystemResources" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PowerSystemResource.AssetDatasheet' kind='element'"
     * @generated
     */
    AssetInfo getAssetDatasheet();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource#getAssetDatasheet <em>Asset Datasheet</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Asset Datasheet</em>' reference.
     * @see #isSetAssetDatasheet()
     * @see #unsetAssetDatasheet()
     * @see #getAssetDatasheet()
     * @generated
     */
    void setAssetDatasheet( AssetInfo value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource#getAssetDatasheet <em>Asset Datasheet</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAssetDatasheet()
     * @see #getAssetDatasheet()
     * @see #setAssetDatasheet(AssetInfo)
     * @generated
     */
    void unsetAssetDatasheet();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource#getAssetDatasheet <em>Asset Datasheet</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Asset Datasheet</em>' reference is set.
     * @see #unsetAssetDatasheet()
     * @see #getAssetDatasheet()
     * @see #setAssetDatasheet(AssetInfo)
     * @generated
     */
    boolean isSetAssetDatasheet();

    /**
     * Returns the value of the '<em><b>Reporting Group</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReportingGroup}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReportingGroup#getPowerSystemResource <em>Power System Resource</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reporting Group</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reporting Group</em>' reference list.
     * @see #isSetReportingGroup()
     * @see #unsetReportingGroup()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPowerSystemResource_ReportingGroup()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReportingGroup#getPowerSystemResource
     * @model opposite="PowerSystemResource" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PowerSystemResource.ReportingGroup' kind='element'"
     * @generated
     */
    EList< ReportingGroup > getReportingGroup();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource#getReportingGroup <em>Reporting Group</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReportingGroup()
     * @see #getReportingGroup()
     * @generated
     */
    void unsetReportingGroup();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource#getReportingGroup <em>Reporting Group</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Reporting Group</em>' reference list is set.
     * @see #unsetReportingGroup()
     * @see #getReportingGroup()
     * @generated
     */
    boolean isSetReportingGroup();

    /**
     * Returns the value of the '<em><b>Assets</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getPowerSystemResources <em>Power System Resources</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Assets</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Assets</em>' reference list.
     * @see #isSetAssets()
     * @see #unsetAssets()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPowerSystemResource_Assets()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getPowerSystemResources
     * @model opposite="PowerSystemResources" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PowerSystemResource.Assets' kind='element'"
     * @generated
     */
    EList< Asset > getAssets();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource#getAssets <em>Assets</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAssets()
     * @see #getAssets()
     * @generated
     */
    void unsetAssets();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource#getAssets <em>Assets</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Assets</em>' reference list is set.
     * @see #unsetAssets()
     * @see #getAssets()
     * @generated
     */
    boolean isSetAssets();

    /**
     * Returns the value of the '<em><b>Operational Tags</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalTag}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalTag#getPowerSystemResource <em>Power System Resource</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operational Tags</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operational Tags</em>' reference list.
     * @see #isSetOperationalTags()
     * @see #unsetOperationalTags()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPowerSystemResource_OperationalTags()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalTag#getPowerSystemResource
     * @model opposite="PowerSystemResource" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PowerSystemResource.OperationalTags' kind='element'"
     * @generated
     */
    EList< OperationalTag > getOperationalTags();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource#getOperationalTags <em>Operational Tags</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOperationalTags()
     * @see #getOperationalTags()
     * @generated
     */
    void unsetOperationalTags();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource#getOperationalTags <em>Operational Tags</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Operational Tags</em>' reference list is set.
     * @see #unsetOperationalTags()
     * @see #getOperationalTags()
     * @generated
     */
    boolean isSetOperationalTags();

    /**
     * Returns the value of the '<em><b>Operating Share</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperatingShare}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperatingShare#getPowerSystemResource <em>Power System Resource</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operating Share</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operating Share</em>' reference list.
     * @see #isSetOperatingShare()
     * @see #unsetOperatingShare()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPowerSystemResource_OperatingShare()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperatingShare#getPowerSystemResource
     * @model opposite="PowerSystemResource" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PowerSystemResource.OperatingShare' kind='element'"
     * @generated
     */
    EList< OperatingShare > getOperatingShare();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource#getOperatingShare <em>Operating Share</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOperatingShare()
     * @see #getOperatingShare()
     * @generated
     */
    void unsetOperatingShare();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource#getOperatingShare <em>Operating Share</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Operating Share</em>' reference list is set.
     * @see #unsetOperatingShare()
     * @see #getOperatingShare()
     * @generated
     */
    boolean isSetOperatingShare();

    /**
     * Returns the value of the '<em><b>Clearances</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ClearanceDocument}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ClearanceDocument#getTaggedPSRs <em>Tagged PS Rs</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Clearances</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Clearances</em>' reference list.
     * @see #isSetClearances()
     * @see #unsetClearances()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPowerSystemResource_Clearances()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ClearanceDocument#getTaggedPSRs
     * @model opposite="TaggedPSRs" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PowerSystemResource.Clearances' kind='element'"
     * @generated
     */
    EList< ClearanceDocument > getClearances();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource#getClearances <em>Clearances</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetClearances()
     * @see #getClearances()
     * @generated
     */
    void unsetClearances();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource#getClearances <em>Clearances</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Clearances</em>' reference list is set.
     * @see #unsetClearances()
     * @see #getClearances()
     * @generated
     */
    boolean isSetClearances();

    /**
     * Returns the value of the '<em><b>Location</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Location#getPowerSystemResources <em>Power System Resources</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Location</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Location</em>' reference.
     * @see #isSetLocation()
     * @see #unsetLocation()
     * @see #setLocation(Location)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPowerSystemResource_Location()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Location#getPowerSystemResources
     * @model opposite="PowerSystemResources" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PowerSystemResource.Location' kind='element'"
     * @generated
     */
    Location getLocation();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource#getLocation <em>Location</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Location</em>' reference.
     * @see #isSetLocation()
     * @see #unsetLocation()
     * @see #getLocation()
     * @generated
     */
    void setLocation( Location value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource#getLocation <em>Location</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLocation()
     * @see #getLocation()
     * @see #setLocation(Location)
     * @generated
     */
    void unsetLocation();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource#getLocation <em>Location</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Location</em>' reference is set.
     * @see #unsetLocation()
     * @see #getLocation()
     * @see #setLocation(Location)
     * @generated
     */
    boolean isSetLocation();

    /**
     * Returns the value of the '<em><b>PSR Type</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PSRType#getPowerSystemResources <em>Power System Resources</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PSR Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PSR Type</em>' reference.
     * @see #isSetPSRType()
     * @see #unsetPSRType()
     * @see #setPSRType(PSRType)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPowerSystemResource_PSRType()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PSRType#getPowerSystemResources
     * @model opposite="PowerSystemResources" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PowerSystemResource.PSRType' kind='element'"
     * @generated
     */
    PSRType getPSRType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource#getPSRType <em>PSR Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PSR Type</em>' reference.
     * @see #isSetPSRType()
     * @see #unsetPSRType()
     * @see #getPSRType()
     * @generated
     */
    void setPSRType( PSRType value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource#getPSRType <em>PSR Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPSRType()
     * @see #getPSRType()
     * @see #setPSRType(PSRType)
     * @generated
     */
    void unsetPSRType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource#getPSRType <em>PSR Type</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>PSR Type</em>' reference is set.
     * @see #unsetPSRType()
     * @see #getPSRType()
     * @see #setPSRType(PSRType)
     * @generated
     */
    boolean isSetPSRType();

    /**
     * Returns the value of the '<em><b>Measurements</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Measurement}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Measurement#getPowerSystemResource <em>Power System Resource</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Measurements</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Measurements</em>' reference list.
     * @see #isSetMeasurements()
     * @see #unsetMeasurements()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPowerSystemResource_Measurements()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Measurement#getPowerSystemResource
     * @model opposite="PowerSystemResource" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PowerSystemResource.Measurements' kind='element'"
     * @generated
     */
    EList< Measurement > getMeasurements();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource#getMeasurements <em>Measurements</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMeasurements()
     * @see #getMeasurements()
     * @generated
     */
    void unsetMeasurements();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource#getMeasurements <em>Measurements</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Measurements</em>' reference list is set.
     * @see #unsetMeasurements()
     * @see #getMeasurements()
     * @generated
     */
    boolean isSetMeasurements();

    /**
     * Returns the value of the '<em><b>PSR Events</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PSREvent}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PSREvent#getPowerSystemResource <em>Power System Resource</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PSR Events</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PSR Events</em>' reference list.
     * @see #isSetPSREvents()
     * @see #unsetPSREvents()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPowerSystemResource_PSREvents()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PSREvent#getPowerSystemResource
     * @model opposite="PowerSystemResource" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PowerSystemResource.PSREvents' kind='element'"
     * @generated
     */
    EList< PSREvent > getPSREvents();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource#getPSREvents <em>PSR Events</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPSREvents()
     * @see #getPSREvents()
     * @generated
     */
    void unsetPSREvents();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource#getPSREvents <em>PSR Events</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>PSR Events</em>' reference list is set.
     * @see #unsetPSREvents()
     * @see #getPSREvents()
     * @generated
     */
    boolean isSetPSREvents();

} // PowerSystemResource
