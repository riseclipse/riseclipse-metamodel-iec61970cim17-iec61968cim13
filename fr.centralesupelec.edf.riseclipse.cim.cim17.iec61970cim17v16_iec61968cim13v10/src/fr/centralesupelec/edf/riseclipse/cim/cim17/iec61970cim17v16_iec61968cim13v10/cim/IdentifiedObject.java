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
 * A representation of the model object '<em><b>Identified Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IdentifiedObject#getAliasName <em>Alias Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IdentifiedObject#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IdentifiedObject#getMRID <em>MRID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IdentifiedObject#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IdentifiedObject#getNames <em>Names</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IdentifiedObject#getDiagramObjects <em>Diagram Objects</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IdentifiedObject#getPropertiesCIMDataObject <em>Properties CIM Data Object</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IdentifiedObject#getTargetingCIMDataObject <em>Targeting CIM Data Object</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getIdentifiedObject()
 * @model
 * @generated
 */
public interface IdentifiedObject extends CimObjectWithID {
    /**
     * Returns the value of the '<em><b>Alias Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Alias Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Alias Name</em>' attribute.
     * @see #isSetAliasName()
     * @see #unsetAliasName()
     * @see #setAliasName(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getIdentifiedObject_AliasName()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='IdentifiedObject.aliasName' kind='element'"
     * @generated
     */
    String getAliasName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IdentifiedObject#getAliasName <em>Alias Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Alias Name</em>' attribute.
     * @see #isSetAliasName()
     * @see #unsetAliasName()
     * @see #getAliasName()
     * @generated
     */
    void setAliasName( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IdentifiedObject#getAliasName <em>Alias Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAliasName()
     * @see #getAliasName()
     * @see #setAliasName(String)
     * @generated
     */
    void unsetAliasName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IdentifiedObject#getAliasName <em>Alias Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Alias Name</em>' attribute is set.
     * @see #unsetAliasName()
     * @see #getAliasName()
     * @see #setAliasName(String)
     * @generated
     */
    boolean isSetAliasName();

    /**
     * Returns the value of the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Description</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Description</em>' attribute.
     * @see #isSetDescription()
     * @see #unsetDescription()
     * @see #setDescription(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getIdentifiedObject_Description()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='IdentifiedObject.description' kind='element'"
     * @generated
     */
    String getDescription();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IdentifiedObject#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Description</em>' attribute.
     * @see #isSetDescription()
     * @see #unsetDescription()
     * @see #getDescription()
     * @generated
     */
    void setDescription( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IdentifiedObject#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDescription()
     * @see #getDescription()
     * @see #setDescription(String)
     * @generated
     */
    void unsetDescription();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IdentifiedObject#getDescription <em>Description</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Description</em>' attribute is set.
     * @see #unsetDescription()
     * @see #getDescription()
     * @see #setDescription(String)
     * @generated
     */
    boolean isSetDescription();

    /**
     * Returns the value of the '<em><b>MRID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>MRID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>MRID</em>' attribute.
     * @see #isSetMRID()
     * @see #unsetMRID()
     * @see #setMRID(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getIdentifiedObject_MRID()
     * @model unsettable="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='IdentifiedObject.mRID' kind='element'"
     * @generated
     */
    String getMRID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IdentifiedObject#getMRID <em>MRID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>MRID</em>' attribute.
     * @see #isSetMRID()
     * @see #unsetMRID()
     * @see #getMRID()
     * @generated
     */
    void setMRID( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IdentifiedObject#getMRID <em>MRID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMRID()
     * @see #getMRID()
     * @see #setMRID(String)
     * @generated
     */
    void unsetMRID();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IdentifiedObject#getMRID <em>MRID</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>MRID</em>' attribute is set.
     * @see #unsetMRID()
     * @see #getMRID()
     * @see #setMRID(String)
     * @generated
     */
    boolean isSetMRID();

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #isSetName()
     * @see #unsetName()
     * @see #setName(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getIdentifiedObject_Name()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='IdentifiedObject.name' kind='element'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IdentifiedObject#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #isSetName()
     * @see #unsetName()
     * @see #getName()
     * @generated
     */
    void setName( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IdentifiedObject#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetName()
     * @see #getName()
     * @see #setName(String)
     * @generated
     */
    void unsetName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IdentifiedObject#getName <em>Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Name</em>' attribute is set.
     * @see #unsetName()
     * @see #getName()
     * @see #setName(String)
     * @generated
     */
    boolean isSetName();

    /**
     * Returns the value of the '<em><b>Names</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Name}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Name#getIdentifiedObject <em>Identified Object</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Names</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Names</em>' reference list.
     * @see #isSetNames()
     * @see #unsetNames()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getIdentifiedObject_Names()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Name#getIdentifiedObject
     * @model opposite="IdentifiedObject" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='IdentifiedObject.Names' kind='element'"
     * @generated
     */
    EList< Name > getNames();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IdentifiedObject#getNames <em>Names</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNames()
     * @see #getNames()
     * @generated
     */
    void unsetNames();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IdentifiedObject#getNames <em>Names</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Names</em>' reference list is set.
     * @see #unsetNames()
     * @see #getNames()
     * @generated
     */
    boolean isSetNames();

    /**
     * Returns the value of the '<em><b>Diagram Objects</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject#getIdentifiedObject <em>Identified Object</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Diagram Objects</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Diagram Objects</em>' reference list.
     * @see #isSetDiagramObjects()
     * @see #unsetDiagramObjects()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getIdentifiedObject_DiagramObjects()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiagramObject#getIdentifiedObject
     * @model opposite="IdentifiedObject" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='IdentifiedObject.DiagramObjects' kind='element'"
     * @generated
     */
    EList< DiagramObject > getDiagramObjects();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IdentifiedObject#getDiagramObjects <em>Diagram Objects</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDiagramObjects()
     * @see #getDiagramObjects()
     * @generated
     */
    void unsetDiagramObjects();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IdentifiedObject#getDiagramObjects <em>Diagram Objects</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Diagram Objects</em>' reference list is set.
     * @see #unsetDiagramObjects()
     * @see #getDiagramObjects()
     * @generated
     */
    boolean isSetDiagramObjects();

    /**
     * Returns the value of the '<em><b>Properties CIM Data Object</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DataSetMember#getPropertiesObject <em>Properties Object</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Properties CIM Data Object</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Properties CIM Data Object</em>' reference.
     * @see #isSetPropertiesCIMDataObject()
     * @see #unsetPropertiesCIMDataObject()
     * @see #setPropertiesCIMDataObject(DataSetMember)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getIdentifiedObject_PropertiesCIMDataObject()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DataSetMember#getPropertiesObject
     * @model opposite="PropertiesObject" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='IdentifiedObject.PropertiesCIMDataObject' kind='element'"
     * @generated
     */
    DataSetMember getPropertiesCIMDataObject();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IdentifiedObject#getPropertiesCIMDataObject <em>Properties CIM Data Object</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Properties CIM Data Object</em>' reference.
     * @see #isSetPropertiesCIMDataObject()
     * @see #unsetPropertiesCIMDataObject()
     * @see #getPropertiesCIMDataObject()
     * @generated
     */
    void setPropertiesCIMDataObject( DataSetMember value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IdentifiedObject#getPropertiesCIMDataObject <em>Properties CIM Data Object</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPropertiesCIMDataObject()
     * @see #getPropertiesCIMDataObject()
     * @see #setPropertiesCIMDataObject(DataSetMember)
     * @generated
     */
    void unsetPropertiesCIMDataObject();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IdentifiedObject#getPropertiesCIMDataObject <em>Properties CIM Data Object</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Properties CIM Data Object</em>' reference is set.
     * @see #unsetPropertiesCIMDataObject()
     * @see #getPropertiesCIMDataObject()
     * @see #setPropertiesCIMDataObject(DataSetMember)
     * @generated
     */
    boolean isSetPropertiesCIMDataObject();

    /**
     * Returns the value of the '<em><b>Targeting CIM Data Object</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DataSetMember}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DataSetMember#getTargetObject <em>Target Object</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Targeting CIM Data Object</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Targeting CIM Data Object</em>' reference list.
     * @see #isSetTargetingCIMDataObject()
     * @see #unsetTargetingCIMDataObject()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getIdentifiedObject_TargetingCIMDataObject()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DataSetMember#getTargetObject
     * @model opposite="TargetObject" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='IdentifiedObject.TargetingCIMDataObject' kind='element'"
     * @generated
     */
    EList< DataSetMember > getTargetingCIMDataObject();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IdentifiedObject#getTargetingCIMDataObject <em>Targeting CIM Data Object</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTargetingCIMDataObject()
     * @see #getTargetingCIMDataObject()
     * @generated
     */
    void unsetTargetingCIMDataObject();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IdentifiedObject#getTargetingCIMDataObject <em>Targeting CIM Data Object</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Targeting CIM Data Object</em>' reference list is set.
     * @see #unsetTargetingCIMDataObject()
     * @see #getTargetingCIMDataObject()
     * @generated
     */
    boolean isSetTargetingCIMDataObject();

} // IdentifiedObject
