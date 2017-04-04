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

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent#getEffectiveDateTime <em>Effective Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent#getModifiedBy <em>Modified By</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent#getRemark <em>Remark</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent#getChangedServiceCategory <em>Changed Service Category</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent#getChangedDocument <em>Changed Document</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent#getChangedUsagePoint <em>Changed Usage Point</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent#getChangedPersonRole <em>Changed Person Role</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent#getChangedAsset <em>Changed Asset</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent#getChangedOrganisationRole <em>Changed Organisation Role</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent#getChangedLocation <em>Changed Location</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getConfigurationEvent()
 * @model
 * @generated
 */
public interface ConfigurationEvent extends ActivityRecord {
    /**
     * Returns the value of the '<em><b>Effective Date Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Effective Date Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Effective Date Time</em>' attribute.
     * @see #isSetEffectiveDateTime()
     * @see #unsetEffectiveDateTime()
     * @see #setEffectiveDateTime(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getConfigurationEvent_EffectiveDateTime()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ConfigurationEvent.effectiveDateTime' kind='element'"
     * @generated
     */
    Date getEffectiveDateTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent#getEffectiveDateTime <em>Effective Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Effective Date Time</em>' attribute.
     * @see #isSetEffectiveDateTime()
     * @see #unsetEffectiveDateTime()
     * @see #getEffectiveDateTime()
     * @generated
     */
    void setEffectiveDateTime( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent#getEffectiveDateTime <em>Effective Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEffectiveDateTime()
     * @see #getEffectiveDateTime()
     * @see #setEffectiveDateTime(Date)
     * @generated
     */
    void unsetEffectiveDateTime();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent#getEffectiveDateTime <em>Effective Date Time</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Effective Date Time</em>' attribute is set.
     * @see #unsetEffectiveDateTime()
     * @see #getEffectiveDateTime()
     * @see #setEffectiveDateTime(Date)
     * @generated
     */
    boolean isSetEffectiveDateTime();

    /**
     * Returns the value of the '<em><b>Modified By</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Modified By</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Modified By</em>' attribute.
     * @see #isSetModifiedBy()
     * @see #unsetModifiedBy()
     * @see #setModifiedBy(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getConfigurationEvent_ModifiedBy()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ConfigurationEvent.modifiedBy' kind='element'"
     * @generated
     */
    String getModifiedBy();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent#getModifiedBy <em>Modified By</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Modified By</em>' attribute.
     * @see #isSetModifiedBy()
     * @see #unsetModifiedBy()
     * @see #getModifiedBy()
     * @generated
     */
    void setModifiedBy( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent#getModifiedBy <em>Modified By</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetModifiedBy()
     * @see #getModifiedBy()
     * @see #setModifiedBy(String)
     * @generated
     */
    void unsetModifiedBy();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent#getModifiedBy <em>Modified By</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Modified By</em>' attribute is set.
     * @see #unsetModifiedBy()
     * @see #getModifiedBy()
     * @see #setModifiedBy(String)
     * @generated
     */
    boolean isSetModifiedBy();

    /**
     * Returns the value of the '<em><b>Remark</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Remark</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Remark</em>' attribute.
     * @see #isSetRemark()
     * @see #unsetRemark()
     * @see #setRemark(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getConfigurationEvent_Remark()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ConfigurationEvent.remark' kind='element'"
     * @generated
     */
    String getRemark();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent#getRemark <em>Remark</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Remark</em>' attribute.
     * @see #isSetRemark()
     * @see #unsetRemark()
     * @see #getRemark()
     * @generated
     */
    void setRemark( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent#getRemark <em>Remark</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRemark()
     * @see #getRemark()
     * @see #setRemark(String)
     * @generated
     */
    void unsetRemark();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent#getRemark <em>Remark</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Remark</em>' attribute is set.
     * @see #unsetRemark()
     * @see #getRemark()
     * @see #setRemark(String)
     * @generated
     */
    boolean isSetRemark();

    /**
     * Returns the value of the '<em><b>Changed Service Category</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ServiceCategory#getConfigurationEvents <em>Configuration Events</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Changed Service Category</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Changed Service Category</em>' reference.
     * @see #isSetChangedServiceCategory()
     * @see #unsetChangedServiceCategory()
     * @see #setChangedServiceCategory(ServiceCategory)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getConfigurationEvent_ChangedServiceCategory()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ServiceCategory#getConfigurationEvents
     * @model opposite="ConfigurationEvents" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ConfigurationEvent.ChangedServiceCategory' kind='element'"
     * @generated
     */
    ServiceCategory getChangedServiceCategory();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent#getChangedServiceCategory <em>Changed Service Category</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Changed Service Category</em>' reference.
     * @see #isSetChangedServiceCategory()
     * @see #unsetChangedServiceCategory()
     * @see #getChangedServiceCategory()
     * @generated
     */
    void setChangedServiceCategory( ServiceCategory value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent#getChangedServiceCategory <em>Changed Service Category</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetChangedServiceCategory()
     * @see #getChangedServiceCategory()
     * @see #setChangedServiceCategory(ServiceCategory)
     * @generated
     */
    void unsetChangedServiceCategory();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent#getChangedServiceCategory <em>Changed Service Category</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Changed Service Category</em>' reference is set.
     * @see #unsetChangedServiceCategory()
     * @see #getChangedServiceCategory()
     * @see #setChangedServiceCategory(ServiceCategory)
     * @generated
     */
    boolean isSetChangedServiceCategory();

    /**
     * Returns the value of the '<em><b>Changed Document</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Document#getConfigurationEvents <em>Configuration Events</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Changed Document</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Changed Document</em>' reference.
     * @see #isSetChangedDocument()
     * @see #unsetChangedDocument()
     * @see #setChangedDocument(Document)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getConfigurationEvent_ChangedDocument()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Document#getConfigurationEvents
     * @model opposite="ConfigurationEvents" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ConfigurationEvent.ChangedDocument' kind='element'"
     * @generated
     */
    Document getChangedDocument();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent#getChangedDocument <em>Changed Document</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Changed Document</em>' reference.
     * @see #isSetChangedDocument()
     * @see #unsetChangedDocument()
     * @see #getChangedDocument()
     * @generated
     */
    void setChangedDocument( Document value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent#getChangedDocument <em>Changed Document</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetChangedDocument()
     * @see #getChangedDocument()
     * @see #setChangedDocument(Document)
     * @generated
     */
    void unsetChangedDocument();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent#getChangedDocument <em>Changed Document</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Changed Document</em>' reference is set.
     * @see #unsetChangedDocument()
     * @see #getChangedDocument()
     * @see #setChangedDocument(Document)
     * @generated
     */
    boolean isSetChangedDocument();

    /**
     * Returns the value of the '<em><b>Changed Usage Point</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UsagePoint#getConfigurationEvents <em>Configuration Events</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Changed Usage Point</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Changed Usage Point</em>' reference.
     * @see #isSetChangedUsagePoint()
     * @see #unsetChangedUsagePoint()
     * @see #setChangedUsagePoint(UsagePoint)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getConfigurationEvent_ChangedUsagePoint()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UsagePoint#getConfigurationEvents
     * @model opposite="ConfigurationEvents" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ConfigurationEvent.ChangedUsagePoint' kind='element'"
     * @generated
     */
    UsagePoint getChangedUsagePoint();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent#getChangedUsagePoint <em>Changed Usage Point</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Changed Usage Point</em>' reference.
     * @see #isSetChangedUsagePoint()
     * @see #unsetChangedUsagePoint()
     * @see #getChangedUsagePoint()
     * @generated
     */
    void setChangedUsagePoint( UsagePoint value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent#getChangedUsagePoint <em>Changed Usage Point</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetChangedUsagePoint()
     * @see #getChangedUsagePoint()
     * @see #setChangedUsagePoint(UsagePoint)
     * @generated
     */
    void unsetChangedUsagePoint();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent#getChangedUsagePoint <em>Changed Usage Point</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Changed Usage Point</em>' reference is set.
     * @see #unsetChangedUsagePoint()
     * @see #getChangedUsagePoint()
     * @see #setChangedUsagePoint(UsagePoint)
     * @generated
     */
    boolean isSetChangedUsagePoint();

    /**
     * Returns the value of the '<em><b>Changed Person Role</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PersonRole#getConfigurationEvents <em>Configuration Events</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Changed Person Role</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Changed Person Role</em>' reference.
     * @see #isSetChangedPersonRole()
     * @see #unsetChangedPersonRole()
     * @see #setChangedPersonRole(PersonRole)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getConfigurationEvent_ChangedPersonRole()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PersonRole#getConfigurationEvents
     * @model opposite="ConfigurationEvents" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ConfigurationEvent.ChangedPersonRole' kind='element'"
     * @generated
     */
    PersonRole getChangedPersonRole();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent#getChangedPersonRole <em>Changed Person Role</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Changed Person Role</em>' reference.
     * @see #isSetChangedPersonRole()
     * @see #unsetChangedPersonRole()
     * @see #getChangedPersonRole()
     * @generated
     */
    void setChangedPersonRole( PersonRole value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent#getChangedPersonRole <em>Changed Person Role</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetChangedPersonRole()
     * @see #getChangedPersonRole()
     * @see #setChangedPersonRole(PersonRole)
     * @generated
     */
    void unsetChangedPersonRole();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent#getChangedPersonRole <em>Changed Person Role</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Changed Person Role</em>' reference is set.
     * @see #unsetChangedPersonRole()
     * @see #getChangedPersonRole()
     * @see #setChangedPersonRole(PersonRole)
     * @generated
     */
    boolean isSetChangedPersonRole();

    /**
     * Returns the value of the '<em><b>Changed Asset</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getConfigurationEvents <em>Configuration Events</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Changed Asset</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Changed Asset</em>' reference.
     * @see #isSetChangedAsset()
     * @see #unsetChangedAsset()
     * @see #setChangedAsset(Asset)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getConfigurationEvent_ChangedAsset()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getConfigurationEvents
     * @model opposite="ConfigurationEvents" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ConfigurationEvent.ChangedAsset' kind='element'"
     * @generated
     */
    Asset getChangedAsset();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent#getChangedAsset <em>Changed Asset</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Changed Asset</em>' reference.
     * @see #isSetChangedAsset()
     * @see #unsetChangedAsset()
     * @see #getChangedAsset()
     * @generated
     */
    void setChangedAsset( Asset value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent#getChangedAsset <em>Changed Asset</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetChangedAsset()
     * @see #getChangedAsset()
     * @see #setChangedAsset(Asset)
     * @generated
     */
    void unsetChangedAsset();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent#getChangedAsset <em>Changed Asset</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Changed Asset</em>' reference is set.
     * @see #unsetChangedAsset()
     * @see #getChangedAsset()
     * @see #setChangedAsset(Asset)
     * @generated
     */
    boolean isSetChangedAsset();

    /**
     * Returns the value of the '<em><b>Changed Organisation Role</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OrganisationRole#getConfigurationEvents <em>Configuration Events</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Changed Organisation Role</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Changed Organisation Role</em>' reference.
     * @see #isSetChangedOrganisationRole()
     * @see #unsetChangedOrganisationRole()
     * @see #setChangedOrganisationRole(OrganisationRole)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getConfigurationEvent_ChangedOrganisationRole()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OrganisationRole#getConfigurationEvents
     * @model opposite="ConfigurationEvents" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ConfigurationEvent.ChangedOrganisationRole' kind='element'"
     * @generated
     */
    OrganisationRole getChangedOrganisationRole();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent#getChangedOrganisationRole <em>Changed Organisation Role</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Changed Organisation Role</em>' reference.
     * @see #isSetChangedOrganisationRole()
     * @see #unsetChangedOrganisationRole()
     * @see #getChangedOrganisationRole()
     * @generated
     */
    void setChangedOrganisationRole( OrganisationRole value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent#getChangedOrganisationRole <em>Changed Organisation Role</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetChangedOrganisationRole()
     * @see #getChangedOrganisationRole()
     * @see #setChangedOrganisationRole(OrganisationRole)
     * @generated
     */
    void unsetChangedOrganisationRole();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent#getChangedOrganisationRole <em>Changed Organisation Role</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Changed Organisation Role</em>' reference is set.
     * @see #unsetChangedOrganisationRole()
     * @see #getChangedOrganisationRole()
     * @see #setChangedOrganisationRole(OrganisationRole)
     * @generated
     */
    boolean isSetChangedOrganisationRole();

    /**
     * Returns the value of the '<em><b>Changed Location</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Location#getConfigurationEvents <em>Configuration Events</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Changed Location</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Changed Location</em>' reference.
     * @see #isSetChangedLocation()
     * @see #unsetChangedLocation()
     * @see #setChangedLocation(Location)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getConfigurationEvent_ChangedLocation()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Location#getConfigurationEvents
     * @model opposite="ConfigurationEvents" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ConfigurationEvent.ChangedLocation' kind='element'"
     * @generated
     */
    Location getChangedLocation();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent#getChangedLocation <em>Changed Location</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Changed Location</em>' reference.
     * @see #isSetChangedLocation()
     * @see #unsetChangedLocation()
     * @see #getChangedLocation()
     * @generated
     */
    void setChangedLocation( Location value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent#getChangedLocation <em>Changed Location</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetChangedLocation()
     * @see #getChangedLocation()
     * @see #setChangedLocation(Location)
     * @generated
     */
    void unsetChangedLocation();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent#getChangedLocation <em>Changed Location</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Changed Location</em>' reference is set.
     * @see #unsetChangedLocation()
     * @see #getChangedLocation()
     * @see #setChangedLocation(Location)
     * @generated
     */
    boolean isSetChangedLocation();

} // ConfigurationEvent
