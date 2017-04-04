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
 * A representation of the model object '<em><b>Structure Support</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StructureSupport#getAnchorRodCount <em>Anchor Rod Count</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StructureSupport#getAnchorRodLength <em>Anchor Rod Length</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StructureSupport#getDirection <em>Direction</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StructureSupport#getLength <em>Length</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StructureSupport#getSize <em>Size</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StructureSupport#getSecuredStructure <em>Secured Structure</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStructureSupport()
 * @model
 * @generated
 */
public interface StructureSupport extends Asset {
    /**
     * Returns the value of the '<em><b>Anchor Rod Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Anchor Rod Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Anchor Rod Count</em>' attribute.
     * @see #isSetAnchorRodCount()
     * @see #unsetAnchorRodCount()
     * @see #setAnchorRodCount(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStructureSupport_AnchorRodCount()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='StructureSupport.anchorRodCount' kind='element'"
     * @generated
     */
    Integer getAnchorRodCount();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StructureSupport#getAnchorRodCount <em>Anchor Rod Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Anchor Rod Count</em>' attribute.
     * @see #isSetAnchorRodCount()
     * @see #unsetAnchorRodCount()
     * @see #getAnchorRodCount()
     * @generated
     */
    void setAnchorRodCount( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StructureSupport#getAnchorRodCount <em>Anchor Rod Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAnchorRodCount()
     * @see #getAnchorRodCount()
     * @see #setAnchorRodCount(Integer)
     * @generated
     */
    void unsetAnchorRodCount();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StructureSupport#getAnchorRodCount <em>Anchor Rod Count</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Anchor Rod Count</em>' attribute is set.
     * @see #unsetAnchorRodCount()
     * @see #getAnchorRodCount()
     * @see #setAnchorRodCount(Integer)
     * @generated
     */
    boolean isSetAnchorRodCount();

    /**
     * Returns the value of the '<em><b>Anchor Rod Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Anchor Rod Length</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Anchor Rod Length</em>' attribute.
     * @see #isSetAnchorRodLength()
     * @see #unsetAnchorRodLength()
     * @see #setAnchorRodLength(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStructureSupport_AnchorRodLength()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='StructureSupport.anchorRodLength' kind='element'"
     * @generated
     */
    Float getAnchorRodLength();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StructureSupport#getAnchorRodLength <em>Anchor Rod Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Anchor Rod Length</em>' attribute.
     * @see #isSetAnchorRodLength()
     * @see #unsetAnchorRodLength()
     * @see #getAnchorRodLength()
     * @generated
     */
    void setAnchorRodLength( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StructureSupport#getAnchorRodLength <em>Anchor Rod Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAnchorRodLength()
     * @see #getAnchorRodLength()
     * @see #setAnchorRodLength(Float)
     * @generated
     */
    void unsetAnchorRodLength();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StructureSupport#getAnchorRodLength <em>Anchor Rod Length</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Anchor Rod Length</em>' attribute is set.
     * @see #unsetAnchorRodLength()
     * @see #getAnchorRodLength()
     * @see #setAnchorRodLength(Float)
     * @generated
     */
    boolean isSetAnchorRodLength();

    /**
     * Returns the value of the '<em><b>Direction</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Direction</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Direction</em>' attribute.
     * @see #isSetDirection()
     * @see #unsetDirection()
     * @see #setDirection(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStructureSupport_Direction()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='StructureSupport.direction' kind='element'"
     * @generated
     */
    Float getDirection();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StructureSupport#getDirection <em>Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Direction</em>' attribute.
     * @see #isSetDirection()
     * @see #unsetDirection()
     * @see #getDirection()
     * @generated
     */
    void setDirection( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StructureSupport#getDirection <em>Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDirection()
     * @see #getDirection()
     * @see #setDirection(Float)
     * @generated
     */
    void unsetDirection();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StructureSupport#getDirection <em>Direction</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Direction</em>' attribute is set.
     * @see #unsetDirection()
     * @see #getDirection()
     * @see #setDirection(Float)
     * @generated
     */
    boolean isSetDirection();

    /**
     * Returns the value of the '<em><b>Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Length</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Length</em>' attribute.
     * @see #isSetLength()
     * @see #unsetLength()
     * @see #setLength(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStructureSupport_Length()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='StructureSupport.length' kind='element'"
     * @generated
     */
    Float getLength();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StructureSupport#getLength <em>Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Length</em>' attribute.
     * @see #isSetLength()
     * @see #unsetLength()
     * @see #getLength()
     * @generated
     */
    void setLength( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StructureSupport#getLength <em>Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLength()
     * @see #getLength()
     * @see #setLength(Float)
     * @generated
     */
    void unsetLength();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StructureSupport#getLength <em>Length</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Length</em>' attribute is set.
     * @see #unsetLength()
     * @see #getLength()
     * @see #setLength(Float)
     * @generated
     */
    boolean isSetLength();

    /**
     * Returns the value of the '<em><b>Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Size</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Size</em>' attribute.
     * @see #isSetSize()
     * @see #unsetSize()
     * @see #setSize(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStructureSupport_Size()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='StructureSupport.size' kind='element'"
     * @generated
     */
    String getSize();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StructureSupport#getSize <em>Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Size</em>' attribute.
     * @see #isSetSize()
     * @see #unsetSize()
     * @see #getSize()
     * @generated
     */
    void setSize( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StructureSupport#getSize <em>Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSize()
     * @see #getSize()
     * @see #setSize(String)
     * @generated
     */
    void unsetSize();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StructureSupport#getSize <em>Size</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Size</em>' attribute is set.
     * @see #unsetSize()
     * @see #getSize()
     * @see #setSize(String)
     * @generated
     */
    boolean isSetSize();

    /**
     * Returns the value of the '<em><b>Secured Structure</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Structure#getStructureSupports <em>Structure Supports</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Secured Structure</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Secured Structure</em>' reference.
     * @see #isSetSecuredStructure()
     * @see #unsetSecuredStructure()
     * @see #setSecuredStructure(Structure)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStructureSupport_SecuredStructure()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Structure#getStructureSupports
     * @model opposite="StructureSupports" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='StructureSupport.SecuredStructure' kind='element'"
     * @generated
     */
    Structure getSecuredStructure();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StructureSupport#getSecuredStructure <em>Secured Structure</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Secured Structure</em>' reference.
     * @see #isSetSecuredStructure()
     * @see #unsetSecuredStructure()
     * @see #getSecuredStructure()
     * @generated
     */
    void setSecuredStructure( Structure value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StructureSupport#getSecuredStructure <em>Secured Structure</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSecuredStructure()
     * @see #getSecuredStructure()
     * @see #setSecuredStructure(Structure)
     * @generated
     */
    void unsetSecuredStructure();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StructureSupport#getSecuredStructure <em>Secured Structure</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Secured Structure</em>' reference is set.
     * @see #unsetSecuredStructure()
     * @see #getSecuredStructure()
     * @see #setSecuredStructure(Structure)
     * @generated
     */
    boolean isSetSecuredStructure();

} // StructureSupport
