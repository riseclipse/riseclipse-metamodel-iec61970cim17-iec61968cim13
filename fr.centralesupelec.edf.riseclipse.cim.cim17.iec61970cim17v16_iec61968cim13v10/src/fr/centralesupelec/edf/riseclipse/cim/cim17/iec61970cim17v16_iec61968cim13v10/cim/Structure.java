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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Structure#getFumigantAppliedDate <em>Fumigant Applied Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Structure#getFumigantName <em>Fumigant Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Structure#getHeight <em>Height</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Structure#getRatedVoltage <em>Rated Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Structure#getRemoveWeed <em>Remove Weed</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Structure#getWeedRemovedDate <em>Weed Removed Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Structure#getStructureSupports <em>Structure Supports</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Structure#getWireSpacingInfos <em>Wire Spacing Infos</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStructure()
 * @model
 * @generated
 */
public interface Structure extends AssetContainer {
    /**
     * Returns the value of the '<em><b>Fumigant Applied Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fumigant Applied Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fumigant Applied Date</em>' attribute.
     * @see #isSetFumigantAppliedDate()
     * @see #unsetFumigantAppliedDate()
     * @see #setFumigantAppliedDate(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStructure_FumigantAppliedDate()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Structure.fumigantAppliedDate' kind='element'"
     * @generated
     */
    Date getFumigantAppliedDate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Structure#getFumigantAppliedDate <em>Fumigant Applied Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fumigant Applied Date</em>' attribute.
     * @see #isSetFumigantAppliedDate()
     * @see #unsetFumigantAppliedDate()
     * @see #getFumigantAppliedDate()
     * @generated
     */
    void setFumigantAppliedDate( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Structure#getFumigantAppliedDate <em>Fumigant Applied Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFumigantAppliedDate()
     * @see #getFumigantAppliedDate()
     * @see #setFumigantAppliedDate(Date)
     * @generated
     */
    void unsetFumigantAppliedDate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Structure#getFumigantAppliedDate <em>Fumigant Applied Date</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fumigant Applied Date</em>' attribute is set.
     * @see #unsetFumigantAppliedDate()
     * @see #getFumigantAppliedDate()
     * @see #setFumigantAppliedDate(Date)
     * @generated
     */
    boolean isSetFumigantAppliedDate();

    /**
     * Returns the value of the '<em><b>Fumigant Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fumigant Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fumigant Name</em>' attribute.
     * @see #isSetFumigantName()
     * @see #unsetFumigantName()
     * @see #setFumigantName(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStructure_FumigantName()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Structure.fumigantName' kind='element'"
     * @generated
     */
    String getFumigantName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Structure#getFumigantName <em>Fumigant Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fumigant Name</em>' attribute.
     * @see #isSetFumigantName()
     * @see #unsetFumigantName()
     * @see #getFumigantName()
     * @generated
     */
    void setFumigantName( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Structure#getFumigantName <em>Fumigant Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFumigantName()
     * @see #getFumigantName()
     * @see #setFumigantName(String)
     * @generated
     */
    void unsetFumigantName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Structure#getFumigantName <em>Fumigant Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fumigant Name</em>' attribute is set.
     * @see #unsetFumigantName()
     * @see #getFumigantName()
     * @see #setFumigantName(String)
     * @generated
     */
    boolean isSetFumigantName();

    /**
     * Returns the value of the '<em><b>Height</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Height</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Height</em>' attribute.
     * @see #isSetHeight()
     * @see #unsetHeight()
     * @see #setHeight(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStructure_Height()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Structure.height' kind='element'"
     * @generated
     */
    Float getHeight();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Structure#getHeight <em>Height</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Height</em>' attribute.
     * @see #isSetHeight()
     * @see #unsetHeight()
     * @see #getHeight()
     * @generated
     */
    void setHeight( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Structure#getHeight <em>Height</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHeight()
     * @see #getHeight()
     * @see #setHeight(Float)
     * @generated
     */
    void unsetHeight();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Structure#getHeight <em>Height</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Height</em>' attribute is set.
     * @see #unsetHeight()
     * @see #getHeight()
     * @see #setHeight(Float)
     * @generated
     */
    boolean isSetHeight();

    /**
     * Returns the value of the '<em><b>Rated Voltage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rated Voltage</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rated Voltage</em>' attribute.
     * @see #isSetRatedVoltage()
     * @see #unsetRatedVoltage()
     * @see #setRatedVoltage(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStructure_RatedVoltage()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Structure.ratedVoltage' kind='element'"
     * @generated
     */
    Float getRatedVoltage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Structure#getRatedVoltage <em>Rated Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rated Voltage</em>' attribute.
     * @see #isSetRatedVoltage()
     * @see #unsetRatedVoltage()
     * @see #getRatedVoltage()
     * @generated
     */
    void setRatedVoltage( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Structure#getRatedVoltage <em>Rated Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRatedVoltage()
     * @see #getRatedVoltage()
     * @see #setRatedVoltage(Float)
     * @generated
     */
    void unsetRatedVoltage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Structure#getRatedVoltage <em>Rated Voltage</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rated Voltage</em>' attribute is set.
     * @see #unsetRatedVoltage()
     * @see #getRatedVoltage()
     * @see #setRatedVoltage(Float)
     * @generated
     */
    boolean isSetRatedVoltage();

    /**
     * Returns the value of the '<em><b>Remove Weed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Remove Weed</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Remove Weed</em>' attribute.
     * @see #isSetRemoveWeed()
     * @see #unsetRemoveWeed()
     * @see #setRemoveWeed(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStructure_RemoveWeed()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Structure.removeWeed' kind='element'"
     * @generated
     */
    Boolean getRemoveWeed();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Structure#getRemoveWeed <em>Remove Weed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Remove Weed</em>' attribute.
     * @see #isSetRemoveWeed()
     * @see #unsetRemoveWeed()
     * @see #getRemoveWeed()
     * @generated
     */
    void setRemoveWeed( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Structure#getRemoveWeed <em>Remove Weed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRemoveWeed()
     * @see #getRemoveWeed()
     * @see #setRemoveWeed(Boolean)
     * @generated
     */
    void unsetRemoveWeed();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Structure#getRemoveWeed <em>Remove Weed</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Remove Weed</em>' attribute is set.
     * @see #unsetRemoveWeed()
     * @see #getRemoveWeed()
     * @see #setRemoveWeed(Boolean)
     * @generated
     */
    boolean isSetRemoveWeed();

    /**
     * Returns the value of the '<em><b>Weed Removed Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Weed Removed Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Weed Removed Date</em>' attribute.
     * @see #isSetWeedRemovedDate()
     * @see #unsetWeedRemovedDate()
     * @see #setWeedRemovedDate(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStructure_WeedRemovedDate()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Structure.weedRemovedDate' kind='element'"
     * @generated
     */
    Date getWeedRemovedDate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Structure#getWeedRemovedDate <em>Weed Removed Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Weed Removed Date</em>' attribute.
     * @see #isSetWeedRemovedDate()
     * @see #unsetWeedRemovedDate()
     * @see #getWeedRemovedDate()
     * @generated
     */
    void setWeedRemovedDate( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Structure#getWeedRemovedDate <em>Weed Removed Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWeedRemovedDate()
     * @see #getWeedRemovedDate()
     * @see #setWeedRemovedDate(Date)
     * @generated
     */
    void unsetWeedRemovedDate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Structure#getWeedRemovedDate <em>Weed Removed Date</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Weed Removed Date</em>' attribute is set.
     * @see #unsetWeedRemovedDate()
     * @see #getWeedRemovedDate()
     * @see #setWeedRemovedDate(Date)
     * @generated
     */
    boolean isSetWeedRemovedDate();

    /**
     * Returns the value of the '<em><b>Structure Supports</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StructureSupport}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StructureSupport#getSecuredStructure <em>Secured Structure</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Structure Supports</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Structure Supports</em>' reference list.
     * @see #isSetStructureSupports()
     * @see #unsetStructureSupports()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStructure_StructureSupports()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StructureSupport#getSecuredStructure
     * @model opposite="SecuredStructure" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Structure.StructureSupports' kind='element'"
     * @generated
     */
    EList< StructureSupport > getStructureSupports();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Structure#getStructureSupports <em>Structure Supports</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStructureSupports()
     * @see #getStructureSupports()
     * @generated
     */
    void unsetStructureSupports();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Structure#getStructureSupports <em>Structure Supports</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Structure Supports</em>' reference list is set.
     * @see #unsetStructureSupports()
     * @see #getStructureSupports()
     * @generated
     */
    boolean isSetStructureSupports();

    /**
     * Returns the value of the '<em><b>Wire Spacing Infos</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireSpacing}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireSpacing#getStructures <em>Structures</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wire Spacing Infos</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wire Spacing Infos</em>' reference list.
     * @see #isSetWireSpacingInfos()
     * @see #unsetWireSpacingInfos()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStructure_WireSpacingInfos()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireSpacing#getStructures
     * @model opposite="Structures" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Structure.WireSpacingInfos' kind='element'"
     * @generated
     */
    EList< WireSpacing > getWireSpacingInfos();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Structure#getWireSpacingInfos <em>Wire Spacing Infos</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWireSpacingInfos()
     * @see #getWireSpacingInfos()
     * @generated
     */
    void unsetWireSpacingInfos();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Structure#getWireSpacingInfos <em>Wire Spacing Infos</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wire Spacing Infos</em>' reference list is set.
     * @see #unsetWireSpacingInfos()
     * @see #getWireSpacingInfos()
     * @generated
     */
    boolean isSetWireSpacingInfos();

} // Structure
