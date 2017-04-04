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
 * A representation of the model object '<em><b>Phase Tap Changer Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseTapChangerTable#getPhaseTapChangerTabular <em>Phase Tap Changer Tabular</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseTapChangerTable#getPhaseTapChangerTablePoint <em>Phase Tap Changer Table Point</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPhaseTapChangerTable()
 * @model
 * @generated
 */
public interface PhaseTapChangerTable extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Phase Tap Changer Tabular</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseTapChangerTabular}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseTapChangerTabular#getPhaseTapChangerTable <em>Phase Tap Changer Table</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Phase Tap Changer Tabular</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Phase Tap Changer Tabular</em>' reference list.
     * @see #isSetPhaseTapChangerTabular()
     * @see #unsetPhaseTapChangerTabular()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPhaseTapChangerTable_PhaseTapChangerTabular()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseTapChangerTabular#getPhaseTapChangerTable
     * @model opposite="PhaseTapChangerTable" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PhaseTapChangerTable.PhaseTapChangerTabular' kind='element'"
     * @generated
     */
    EList< PhaseTapChangerTabular > getPhaseTapChangerTabular();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseTapChangerTable#getPhaseTapChangerTabular <em>Phase Tap Changer Tabular</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPhaseTapChangerTabular()
     * @see #getPhaseTapChangerTabular()
     * @generated
     */
    void unsetPhaseTapChangerTabular();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseTapChangerTable#getPhaseTapChangerTabular <em>Phase Tap Changer Tabular</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Phase Tap Changer Tabular</em>' reference list is set.
     * @see #unsetPhaseTapChangerTabular()
     * @see #getPhaseTapChangerTabular()
     * @generated
     */
    boolean isSetPhaseTapChangerTabular();

    /**
     * Returns the value of the '<em><b>Phase Tap Changer Table Point</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseTapChangerTablePoint}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseTapChangerTablePoint#getPhaseTapChangerTable <em>Phase Tap Changer Table</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Phase Tap Changer Table Point</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Phase Tap Changer Table Point</em>' reference list.
     * @see #isSetPhaseTapChangerTablePoint()
     * @see #unsetPhaseTapChangerTablePoint()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPhaseTapChangerTable_PhaseTapChangerTablePoint()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseTapChangerTablePoint#getPhaseTapChangerTable
     * @model opposite="PhaseTapChangerTable" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PhaseTapChangerTable.PhaseTapChangerTablePoint' kind='element'"
     * @generated
     */
    EList< PhaseTapChangerTablePoint > getPhaseTapChangerTablePoint();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseTapChangerTable#getPhaseTapChangerTablePoint <em>Phase Tap Changer Table Point</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPhaseTapChangerTablePoint()
     * @see #getPhaseTapChangerTablePoint()
     * @generated
     */
    void unsetPhaseTapChangerTablePoint();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseTapChangerTable#getPhaseTapChangerTablePoint <em>Phase Tap Changer Table Point</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Phase Tap Changer Table Point</em>' reference list is set.
     * @see #unsetPhaseTapChangerTablePoint()
     * @see #getPhaseTapChangerTablePoint()
     * @generated
     */
    boolean isSetPhaseTapChangerTablePoint();

} // PhaseTapChangerTable
